package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtxtDisplay;
    private Button mbtn;
    private String res;
    private RadioGroup mradGrpGender, mradGrpAge;
    private RadioButton mradBtnAge1, mradBtnAge2, mradBtnAge3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemSetting();

        mbtn.setOnClickListener(v -> {

            res = "";

            switch (mradGrpAge.getCheckedRadioButtonId()){
                case R.id.radBtnAge1:
                    res += getString(R.string.suggest1);
                    break;
                case R.id.radBtnAge2:
                    res += getString(R.string.suggest2);
                    break;
                case R.id.radBtnAge3:
                    res += getString(R.string.suggest3);
                    break;
            }

            mtxtDisplay.setText(res);
        });

        mradGrpGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radBtnMale){
                    mradBtnAge1.setText(getString(R.string.mage1));
                    mradBtnAge2.setText(getString(R.string.mage2));
                    mradBtnAge3.setText(getString(R.string.mage3));
                }
                else{
                    mradBtnAge1.setText(getString(R.string.fage1));
                    mradBtnAge1.setText(getString(R.string.fage2));
                    mradBtnAge3.setText(getString(R.string.fage3));
                }
            }
        });
    }


    public void itemSetting(){

        mtxtDisplay = findViewById(R.id.txtDisplay);
        mbtn = findViewById(R.id.btn);
        mradGrpGender = findViewById(R.id.radGrpGender);
        mradGrpAge = findViewById(R.id.radGrpAge);
        mradBtnAge1 = findViewById(R.id.radBtnAge1);
        mradBtnAge2 = findViewById(R.id.radBtnAge2);
        mradBtnAge3 = findViewById(R.id.radBtnAge3);
    }


}