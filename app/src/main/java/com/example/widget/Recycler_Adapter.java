package com.example.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.view_holder> {

    private String[] fav;

    public Recycler_Adapter(String[] favourite) {
        this.fav=favourite;
    }


    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.sample_recyclerview,parent,false);
        return new view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {
        String title=fav[position];
        holder.text1.setText(title);
    }

    @Override
    public int getItemCount() {
        return fav.length;
    }

    public class view_holder extends RecyclerView.ViewHolder{

        private ImageView img1;
        private TextView text1;

        public view_holder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img_1);
            text1=itemView.findViewById(R.id.text_1);
        }
    }
}
