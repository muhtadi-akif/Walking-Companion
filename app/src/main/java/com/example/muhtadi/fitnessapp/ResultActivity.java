package com.example.muhtadi.fitnessapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView txtNumResult = findViewById(R.id.txtResultNum);
        TextView txtResult = findViewById(R.id.txtResult);
        int bpm = getIntent().getIntExtra("Value",0);
        try{
            txtNumResult.setText(bpm+" BPM");
            if(bpm<60){
                txtResult.setText("Go For A Walk");
            }else if(bpm>=60&&bpm<=120){
                txtResult.setText("Normal! You're Healthy");
            }else if(bpm>120){
                txtResult.setText("Risky! Emergency Medication Needed");
            }else {
                txtResult.setText("Something Went Wrong");
            }
        }catch (NullPointerException e){
            txtNumResult.setText("--");
            txtResult.setText("Something Went Wrong");
        }


    }
}
