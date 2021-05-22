package com.example.chkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mChkBoxMusic, mChkBoxSing, mChkBoxDance,
            mChkBoxTravel, mChkBoxReading, mChkBoxWriting,
            mChkBoxClimbing, mChkBoxSwim, mChkBoxExercise,
            mChkBoxFitness, mChkBoxPhoto, mChkBoxFood,
            mChkBoxPainting;
    private Button mbtn;
    private TextView mtxtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemSetting();

        mbtn.setOnClickListener(v -> {
            String s = "";
            if(mChkBoxMusic.isChecked()){
                s += mChkBoxMusic.getText().toString();
            }

            if (mChkBoxSing.isChecked())
                s += mChkBoxSing.getText().toString();

            if (mChkBoxDance.isChecked())
                s += mChkBoxDance.getText().toString();

            if (mChkBoxTravel.isChecked())
                s += mChkBoxTravel.getText().toString();

            if (mChkBoxReading.isChecked())
                s += mChkBoxReading.getText().toString();

            if (mChkBoxWriting.isChecked())
                s += mChkBoxWriting.getText().toString();

            if (mChkBoxClimbing.isChecked())
                s += mChkBoxClimbing.getText().toString();

            if (mChkBoxSwim.isChecked())
                s += mChkBoxSwim.getText().toString();

            if (mChkBoxExercise.isChecked())
                s += mChkBoxExercise.getText().toString();

            if (mChkBoxFitness.isChecked())
                s += mChkBoxFitness.getText().toString();

            if (mChkBoxPhoto.isChecked())
                s += mChkBoxPhoto.getText().toString();

            if (mChkBoxFood.isChecked())
                s += mChkBoxFood.getText().toString();

            if (mChkBoxPainting.isChecked())
                s += mChkBoxPainting.getText().toString();

            mtxtDisplay.setText(s);
        });
    }

    public void itemSetting(){
        mChkBoxMusic = findViewById(R.id.chkBoxMusic);
        mChkBoxSing = findViewById(R.id.chkBoxSing);
        mChkBoxDance = findViewById(R.id.chkBoxDance);
        mChkBoxTravel = findViewById(R.id.chkBoxTravel);
        mChkBoxReading = findViewById(R.id.chkBoxReading);
        mChkBoxWriting = findViewById(R.id.chkBoxWriting);
        mChkBoxClimbing = findViewById(R.id.chkBoxClimbing);
        mChkBoxSwim = findViewById(R.id.chkBoxSwim);
        mChkBoxExercise = findViewById(R.id.chkBoxExercise);
        mChkBoxFitness = findViewById(R.id.chkBoxFitness);
        mChkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        mChkBoxFood = findViewById(R.id.chkBoxFood);
        mChkBoxPainting = findViewById(R.id.chkBoxPainting);
        mbtn = findViewById(R.id.btn);
        mtxtDisplay = findViewById(R.id.txtDisplay);
    }
}