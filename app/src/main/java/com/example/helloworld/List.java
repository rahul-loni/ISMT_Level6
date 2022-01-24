package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {

    ListView listView;
    String [] list_name= {"Rahul","Rohan","Ritik","Rupak","Nepal","India","Chitwan",
            "Ktm","Rahul","Rohan","Ritik","Rupak","Nepal","India","Chitwan","Ktm",
            "Rahul","Rohan","Ritik","Rupak","Nepal","India","Chitwan","Ktm"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,list_name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                   if(i==1){
                        Intent intent=new Intent(getApplicationContext(),Signup_Page.class);
                        startActivity(intent);
                   }
                   if(i==5){
                       Intent mainintent=new Intent(getApplicationContext(),MainActivity.class);
                       startActivity(mainintent);
                   }
            }
        });
    }
}