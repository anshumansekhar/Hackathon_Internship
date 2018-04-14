package com.example.anshuman_hp.institute;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class TimelineRecyclerAdapter extends RecyclerView.Adapter<timelineholder> {
    @Override
    public timelineholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.qaz, parent, false);
        Log.e("aljfdjg","OncreatevieHol");
        return new timelineholder(itemView);
    }

    @Override
    public void onBindViewHolder(timelineholder holder, int position) {
        Log.e("sj","onBind");
        holder.attending.setText("70");
        holder.collegename.setText("IGIT SARANG");
        holder.Description.setText("EDM Night");
        holder.image.setImageResource(R.mipmap.ic_launcher);
        holder.numdislikes.setText("5");
        holder.profile.setImageResource(R.mipmap.ic_launcher_round);
        holder.username.setText("Anshuman");
        holder.numlikes.setText("45");

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
