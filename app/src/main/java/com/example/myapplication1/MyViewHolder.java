package com.example.myapplication1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameView,descriptionView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView=itemView.findViewById(R.id.item_name);
        descriptionView=itemView.findViewById(R.id.item_description);
        imageView=itemView.findViewById(R.id.item_image_view);
    }
}
