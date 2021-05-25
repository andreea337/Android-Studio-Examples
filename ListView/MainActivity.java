package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ListView mlistV;
    private TextView mtxtRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemSetting();
        ArrayAdapter<CharSequence> arrayAdapter =
                ArrayAdapter.createFromResource(getApplication(), R.array.region_list, android.R.layout.simple_list_item_1);

        mlistV.setAdapter(arrayAdapter);
        mlistV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mtxtRegion.setText(((TextView)view).getText());
            }
        });
    }

    private void itemSetting(){
        mlistV = findViewById(R.id.listV);
        mtxtRegion = findViewById(R.id.txtRegion);
    }


}