package com.example.recview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.location.GnssStatusCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.time.temporal.Temporal;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>
{

    String names[];
    int images[];
    Context context;

    public MyAdapter(String[] names, int[] images, Context context) {
        this.names = names;
        this.images = images;
        this.context = context;
    }

    public MyAdapter(int[] images, String[] names) {
        this.images=images;
        this.names=names;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.ui_view,parent,false);
        return new  myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        holder.img_view.setImageResource(images[position]);
        holder.header_text.setText(names[position]);


    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    //creating view holder
    public static class myviewholder extends RecyclerView.ViewHolder {

        ImageView img_view;
        TextView header_text;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img_view=(ImageView)itemView.findViewById(R.id.img_view);
            header_text=(TextView) itemView.findViewById(R.id.header_text);
        }
    }

}
