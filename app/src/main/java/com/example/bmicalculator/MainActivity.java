package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etWeight,etHigh;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    }

    private void connectComponents() {
        etWeight = findViewById(R.id.etWeightMain);
        etHigh = findViewById(R.id.etHighMain);
        btnCalculate = findViewById(R.id.btnCalculateMain);
    }

    public void calculate(View view) {
        String weight = etWeight.getText().toString();
        String high = etHigh.getText().toString();
        double w,h,BMI;
        w = Double.parseDouble(weight);
        h = Double.parseDouble(high);
        BMI = w/(h*h);
        Toast.makeText(this, "Your BMI is:"+BMI, Toast.LENGTH_SHORT).show();
    }
}