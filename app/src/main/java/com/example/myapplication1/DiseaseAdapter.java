package com.example.myapplication1;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DiseaseAdapter extends RecyclerView.Adapter<MyViewHolder>{
   Context context;
   List<Disease>diseases;

    public DiseaseAdapter(Context context,List<Disease> diseases) {
        this.context=context;
        this.diseases = diseases;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(diseases.get(position).getName());
        holder.imageView.setImageResource(diseases.get(position).getImageResId());
        holder.descriptionView.setText(diseases.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return diseases.size();
    }
}

