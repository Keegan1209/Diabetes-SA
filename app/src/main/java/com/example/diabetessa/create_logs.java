package com.example.diabetessa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create_logs extends AppCompatActivity {

    String timeRecorded;
    String bloodPressure;
    String medication;
    String foodTypes;
    String activity;

    int bloodSugar;

    EditText timeEdt;
    EditText bloodSugarEdt;
    EditText bloodPressureEdt;
    EditText medicationEdt;
    EditText foodTypesEdt;
    EditText activityEdt;

    Button createLogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_logs);

        timeEdt = (EditText) findViewById(R.id.edtTime);
        bloodSugarEdt = (EditText) findViewById(R.id.edtBloodSugar);
        bloodPressureEdt = (EditText) findViewById(R.id.edtBloodPressure);
        medicationEdt = (EditText) findViewById(R.id.edtMedication);
        foodTypesEdt = (EditText) findViewById(R.id.edtFood);
        activityEdt = (EditText) findViewById(R.id.edtActivity);

        createLogBtn = (Button) findViewById(R.id.btnCreateLog);
        createLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeRecorded = timeEdt.getText().toString();
                bloodSugar = Integer.valueOf(bloodSugarEdt.getText().toString());
                bloodPressure = bloodPressureEdt.getText().toString();
                medication = medicationEdt.getText().toString();
                foodTypes = foodTypesEdt.getText().toString();
                activity = activityEdt.getText().toString();
            }
        });


    }



}