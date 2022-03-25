package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> itemlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items cheese = new Items("Cheese" , R.drawable.cheese , 2.0);
        itemlist.add(cheese);

        ItemAdapter itemAdapter = new ItemAdapter(this , 0 , itemlist);

        ListView list = findViewById(R.id.listView);
        list.setAdapter(itemAdapter);




    }
}