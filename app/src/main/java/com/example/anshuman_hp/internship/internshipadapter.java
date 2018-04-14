package com.example.anshuman_hp.internship;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class internshipadapter extends RecyclerView.Adapter<internshipholder> {
    Context c;
    List<internshipdetails> data;

    public internshipadapter(Context c, List<internshipdetails> data) {
        this.c = c;
        this.data = data;
    }
    internshipdetails obj;
    @Override
    public internshipholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.internship_card,parent,false);
        return new internshipholder(v);
    }

    @Override
    public void onBindViewHolder(internshipholder holder, int position) {
        obj=data.get(position);
        Log.v("aaa",obj.getName());
        holder.name.setText(obj.getName());
        holder.url.setText(obj.getUrl());
        holder.gotolink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),DetailInternship.class);
                i.putExtra("URL",obj.getUrl());
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
}
