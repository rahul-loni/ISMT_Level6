package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Grid_View extends AppCompatActivity {
    GridView grid_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        grid_view=findViewById(R.id.grid);
        grid_view.setAdapter(new InageAdapter(this));


        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Grid_View.this, "Click Items +i", Toast.LENGTH_SHORT).show();

                Intent fullimageintent=new Intent(getApplicationContext(),Full_Screen.class);
                fullimageintent.putExtra("id",i);
                startActivity(fullimageintent);
            }
        });



    }
}