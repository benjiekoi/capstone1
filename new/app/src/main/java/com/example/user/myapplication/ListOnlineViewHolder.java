package com.example.user.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 2/15/2018.
 */

public class ListOnlineViewHolder extends RecyclerView.ViewHolder
implements View.OnClickListener{


    TextView txtEmail;
    ItemClickListener itemClickListener;

    public ListOnlineViewHolder(View itemView) {

        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {

        this.itemClickListener = itemClickListener;


    }


    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition());

    }
}
