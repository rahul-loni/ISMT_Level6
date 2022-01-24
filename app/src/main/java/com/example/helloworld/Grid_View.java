package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Grid_View extends AppCompatActivity {
    GridView grid_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        grid_view=findViewById(R.id.grid);


        grid_view.setAdapter(new InageAdapter(this));
    }
}