package com.example.anshuman_hp.institute;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anshuman_hp.institute.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class timelineholder extends RecyclerView.ViewHolder {
    CircleImageView profile;
    TextView username;
    TextView collegename;
    ImageView image;
    TextView Description;
    TextView numlikes,numdislikes,attending;

    public timelineholder(View itemView) {
        super(itemView);
        profile=(CircleImageView)itemView.findViewById(R.id.profileimage);
        username=(TextView)itemView.findViewById(R.id.profilename);
        collegename=(TextView)itemView.findViewById(R.id.collegename);
        image=(ImageView)itemView.findViewById(R.id.photo);
        Description=(TextView)itemView.findViewById(R.id.descp);
        numdislikes=(TextView)itemView.findViewById(R.id.numdislikes);
        numlikes=(TextView)itemView.findViewById(R.id.numlikes);
        attending=(TextView)itemView.findViewById(R.id.attending);
    }
}
