package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemSetting();

        // 把項目清單準備好，放在一個List物件裏頭
        List<String> list = new ArrayList<>();
        for(int i=1; i<=50; i++){
            list.add("第"+i+"項");
        }
        // 設定RecyclerView使用的LayoutManager
        // LayoutManager決定項目的排列方式。
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 建立RecyclerView的Adapter物件，傳入包含項目清單的List物件
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);

        // 把Adapter物件傳給RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void itemSetting(){
        recyclerView = findViewById(R.id.recyclerView);
    }
}