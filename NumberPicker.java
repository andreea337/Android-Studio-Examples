package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtxtDisplay;
    private Button mbtn;
    private String res;
    private RadioGroup mradGrpGender;
    private NumberPicker numberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemSetting();
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(100);
        numberPicker.setValue(25);

        mbtn.setOnClickListener(v -> {

            int age = numberPicker.getValue();
            res = "";

            switch (mradGrpGender.getCheckedRadioButtonId()){
                case R.id.radBtnMale:
                    if(age < 28){
                        res += getString(R.string.suggest1);
                    }
                    else if(age > 33){
                        res += getString(R.string.suggest3);
                    }
                    else{
                        res += getString(R.string.suggest2);
                    }
                    break;
                case R.id.radBtnFemale:
                    if(age < 25){
                        res += getString(R.string.suggest1);
                    }
                    else if(age > 30){
                        res += getString(R.string.suggest3);
                    }
                    else{
                        res += getString(R.string.suggest2);
                    }

            }

            mtxtDisplay.setText(res);
        });


    }


    public void itemSetting(){

        mtxtDisplay = findViewById(R.id.txtDisplay);
        mbtn = findViewById(R.id.btn);
        mradGrpGender = findViewById(R.id.radGrpGender);
        numberPicker = findViewById(R.id.numpick);
    }


}