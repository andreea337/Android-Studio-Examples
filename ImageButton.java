package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton mimgbtnPaper, mimgbtnScc, mimgbtnStone;
    ImageView mimgView;
    TextView mtxtDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemSetting();

        mimgbtnPaper.setOnClickListener(v -> {
            int com = (int)(Math.random()*3+1);
            switch (com){
                case 1: //player win
                    mtxtDis.setText(R.string.win);
                    mimgView.setImageResource(R.drawable.stone);
                    break;
                case 2: //player lose
                    mtxtDis.setText(R.string.lose);
                    mimgView.setImageResource(R.drawable.scissors);
                    break;
                case 3:
                    mtxtDis.setText(R.string.draw);
                    mimgView.setImageResource(R.drawable.paper);
            }
        });

        mimgbtnScc.setOnClickListener(v -> {
            int com = (int)(Math.random()*3+1);
            switch (com){
                case 1: //player win
                    mtxtDis.setText(R.string.win);
                    mimgView.setImageResource(R.drawable.paper);
                    break;
                case 2: //player lose
                    mtxtDis.setText(R.string.lose);
                    mimgView.setImageResource(R.drawable.stone);
                    break;
                case 3:
                    mtxtDis.setText(R.string.draw);
                    mimgView.setImageResource(R.drawable.scissors);
            }
        });

        mimgbtnStone.setOnClickListener(v -> {
            int com = (int)(Math.random()*3+1);
            switch (com){
                case 1: //player win
                    mtxtDis.setText(R.string.win);
                    mimgView.setImageResource(R.drawable.scissors);
                    break;
                case 2: //player lose
                    mtxtDis.setText(R.string.lose);
                    mimgView.setImageResource(R.drawable.paper);
                    break;
                case 3:
                    mtxtDis.setText(R.string.draw);
                    mimgView.setImageResource(R.drawable.stone);
            }
        });
    }

    private void itemSetting(){
        mimgbtnPaper = findViewById(R.id.imgbtnPaper);
        mimgbtnScc = findViewById(R.id.imgbtnScc);
        mimgbtnStone = findViewById(R.id.imgbtnStone);
        mimgView = findViewById(R.id.imgView);
        mtxtDis = findViewById(R.id.txtDis);
    }


}