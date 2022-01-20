package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button signup_btn , login_btn;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup_btn=findViewById(R.id.btn_signup);
        login_btn=findViewById(R.id.btn_login);
        spinner=findViewById(R.id.spinner);

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Rahul");
        arrayList.add("Rohan sir");
        arrayList.add("Rupak sir");
        arrayList.add("Binod Sir");
        arrayList.add("Sunny Sir");
        arrayList.add("Asmit Sir");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                         android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);






        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Signup_Page.class);
                startActivity(intent);
            }
        });

    }

    public void Signup(View view) {
        Intent intent =new Intent(MainActivity.this,Signup_Page.class);
        startActivity(intent);

    }
}