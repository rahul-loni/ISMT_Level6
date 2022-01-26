package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Full_Screen extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Image");

        imageView=findViewById(R.id.fullImage);

        Intent intent=getIntent();
        int i =intent.getExtras().getInt("id");

        InageAdapter inageAdapter=new InageAdapter(this);

        imageView.setImageResource(inageAdapter.imageArray[i]);



    }
}