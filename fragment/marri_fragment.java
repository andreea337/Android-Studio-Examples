package com.example.spinner;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioGroup;
import android.widget.TextView;

public class marri_fragment extends Fragment {

    private TextView mtxtDisplay;
    private Button mbtn;
    private String res;
    private RadioGroup mradGrpGender;
    private NumberPicker numberPicker;

    public marri_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_marri_fragment, container, false);
        itemSetting(view);
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
        return view;

    }


    public void itemSetting(View v){

        mtxtDisplay = v.findViewById(R.id.txtDisplay);
        mbtn = v.findViewById(R.id.btn);
        mradGrpGender = v.findViewById(R.id.radGrpGender);
        numberPicker = v.findViewById(R.id.numpick);
    }

}