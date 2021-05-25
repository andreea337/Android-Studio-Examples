package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar mSeekBar;
    private RatingBar mRatingBar;
    private TextView mtxtRating, mtxtSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemSetting();

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mtxtSeek.setText("Seek bar progress: " + String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                mtxtRating.setText("Rating bar star: " + String.valueOf(rating));
            }
        });
    }

    private void itemSetting(){
        mSeekBar = findViewById(R.id.seekBar);
        mRatingBar = findViewById(R.id.ratingBar);
        mtxtRating = findViewById(R.id.txtRating);
        mtxtSeek = findViewById(R.id.txtSeeK);
    }
}