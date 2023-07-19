package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Data source
    String[] names={"BEN TEN","DOREMON","MICKY MOUSE","MOTU PATLU","NARUTO","NEMO","NINJA","OGGY & COCK"};
    int [] images={R.drawable.benten,R.drawable.doremon,R.drawable.mickymouse,R.drawable.motupatlu,R.drawable.naruto,R.drawable.nemo,R.drawable.ninja,R.drawable.oggyandcockroch,R.drawable.tomandjerry};
    RecyclerView recview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recview=(RecyclerView) findViewById(R.id.recview);

        MyAdapter myAdapter=new MyAdapter(images,names);
        recview.setAdapter(myAdapter);
        //THIS IS FOR LINEAR LAYOUT SHOWING
       recview.setLayoutManager(new LinearLayoutManager(this));
        //This is for gridlayout showing
       // recview.setLayoutManager(new GridLayoutManager(this,2));
        //This is for staggerd layout showing
        //recview.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }
}