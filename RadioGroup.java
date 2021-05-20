package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText medtAge;
    private TextView mtxtDisplay;
    private Button mbtn;
    private String res;
    private RadioGroup mradGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemSetting();

        mbtn.setOnClickListener(v -> {
            int age = Integer.parseInt(medtAge.getText().toString());
            res = "";

            switch (mradGrp.getCheckedRadioButtonId()){
                case R.id.radBtnMale:
                    if(age < 28){
                        res += "還不急著結婚";
                    }
                    else if(age > 33){
                        res += "趕快找個對象";
                    }
                    else{
                        res += "可以再飄泊一下";
                    }
                    break;
                case R.id.radBtnFemale:
                    if(age < 25){
                        res += "還不急著結婚";
                    }
                    else if(age > 30){
                        res += "趕快找個對象";
                    }
                    else{
                        res += "可以再飄泊一下";
                    }
            }

            mtxtDisplay.setText(res);
        });

    }

    public void itemSetting(){
        medtAge = findViewById(R.id.edtAge);
        mtxtDisplay = findViewById(R.id.txtDisplay);
        mbtn = findViewById(R.id.btn);
        mradGrp = findViewById(R.id.radGrp);
    }


}