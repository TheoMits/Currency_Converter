package com.j2.converts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<String> list = new ArrayList<>();
        list.add("Euro to US Dollar");
        list.add("US Dollar to Euro");
        list.add("Euro to GBP Pound");
        list.add("GBP Pound to Euro");
        list.add("Euro to JPY Yen");
        list.add("JPY Yen to Euro");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list,this);
        recyclerView.setAdapter(adapter);

    }
}