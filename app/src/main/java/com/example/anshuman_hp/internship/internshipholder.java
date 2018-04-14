package com.example.anshuman_hp.internship;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.jivimberg.library.AutoResizeTextView;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class internshipholder extends RecyclerView.ViewHolder {
    TextView name;
    TextView url;
    Button gotolink;
    public internshipholder(View itemView) {
        super(itemView);
        name=(AutoResizeTextView)itemView.findViewById(R.id.internshipname);
        url=(AutoResizeTextView)itemView.findViewById(R.id.internshipurl);
        gotolink=(Button)itemView.findViewById(R.id.Goto);
    }
}
