package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CmToMeter extends AppCompatActivity {

    EditText meter_text;
    Button cm_converter;
    TextView cm_result;
    ImageView m_cm, kg_g, kg_pound, temp, m_feet, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_to_meter);

        meter_text = findViewById(R.id.meter_text);
        cm_converter = findViewById(R.id.cm_converter);
        kg_g = findViewById(R.id.kg_g);
        kg_pound = findViewById(R.id.kg_pound);
        temp = findViewById(R.id.temp);
        m_feet = findViewById(R.id.m_feet);
        speed = findViewById(R.id.speed);
        m_cm = findViewById(R.id.m_cm);
        cm_result = findViewById(R.id.cm_result);


        cm_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = meter_text.getText();
                int a = Integer.parseInt(String.valueOf(meter_text.getText()));
                cm_result.setText("Result: "+ input +" Centimeter is equal to "+a*0.01+" Meter");
                meter_text.setText("");

            }
        });



        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, MeterToCm.class);
                startActivity(intent);
            }
        });

        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, KgToGram.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, KgToPound.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, MeterToFeet.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CmToMeter.this, Speed.class);
                startActivity(intent);
            }
        });

    }
}