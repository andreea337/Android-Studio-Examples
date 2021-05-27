package com.example.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<HashMap<String, String >> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //read the data file and store into String Array
        InputStream is = getResources().openRawResource(R.raw.output);
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String data = "";
        String line;
        try {
            while ((line = r.readLine()) != null) {
                data += line;
                data += "\n";
            }
        } catch (IOException e) {
            Log.d("IO", e + "");
        }
        int len = data.split("\n").length;
        String[] strArr = new String[len];
        strArr = data.split("\n");
        for(int i=0; i<strArr.length; i++){
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("title", strArr[i]);
            i++;
            hashMap.put("desc", strArr[i]);
            i++;
            hashMap.put("url", strArr[i]);
            arrayList.add(hashMap);
        }

        itemSetting();
        setRecyclerView();
    }

    private void itemSetting(){
        recyclerView = findViewById(R.id.recyclerview);
    }

    private void setRecyclerView(){
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}

