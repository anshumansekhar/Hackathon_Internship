package com.example.anshuman_hp.internship;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView internship_card;
    Network network;
    SwipeRefreshLayout internshipswipe;
    Cache cache;
    String url="http://technotracts.com/internshipget.php";
    RequestQueue rq;
    List<internshipdetails> data=new ArrayList<>();
    internshipdetails internshipdetails;
    ProgressDialog pf;
    internshipadapter internshipadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internshipswipe=(SwipeRefreshLayout)findViewById(R.id.internshipswipe);
        internshipswipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                internshipswipe.setRefreshing(true);
                getinstitute();
                pf.show();

            }
        });
        pf=new ProgressDialog(this);
        pf.setMessage("Loading");
        pf.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        network=new BasicNetwork(new HurlStack());
        cache=new DiskBasedCache(getCacheDir(),1024*1024);
        rq=new RequestQueue(cache,network);
        rq.start();
        internshipadapter=new internshipadapter(this,data);
        internship_card=(RecyclerView)findViewById(R.id.internship_card);
        internship_card.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        getinstitute();
        pf.show();
    }
    public void getinstitute(){
        AsyncTask<Integer,Void,Void> task=new AsyncTask<Integer, Void, Void>() {
            @Override
            protected Void doInBackground(Integer... params) {
                JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.v("vhjm,", response.toString().replaceAll("\n",""));
                        for (int i = 0; i < response.length(); ++i) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(i);
                                internshipdetails = new internshipdetails(jsonObject.getString("url"), jsonObject.getString("name"));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            data.add(internshipdetails);
                        }
                        pf.cancel();
                        internship_card.setAdapter(internshipadapter);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                rq.add(jsonArrayRequest);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {

                internshipadapter.notifyDataSetChanged();


            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                internshipswipe.setRefreshing(false);
            }
        };
        task.execute();
    }


}

