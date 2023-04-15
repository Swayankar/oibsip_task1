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

public class FeetToMeter extends AppCompatActivity {
    EditText meter_text;
    Button feet_converter;
    TextView feet_result;
    ImageView m_feet, kg_g, kg_pound, temp, m_cm, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feet_to_meter);

        meter_text = findViewById(R.id.meter_text);
        feet_converter = findViewById(R.id.feet_converter);
        kg_g = findViewById(R.id.kg_g);
        kg_pound = findViewById(R.id.kg_pound);
        temp = findViewById(R.id.temp);
        m_cm = findViewById(R.id.m_cm);
        speed = findViewById(R.id.speed);
        m_feet = findViewById(R.id.m_feet);
        feet_result = findViewById(R.id.feet_result);


        feet_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = meter_text.getText();
                int a = Integer.parseInt(String.valueOf(meter_text.getText()));
                feet_result.setText("Result: "+ input +" Feet is equal to "+a*0.30+" Meter");
                meter_text.setText("");

            }
        });


        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, MeterToFeet.class);
                startActivity(intent);
            }
        });


        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, KgToGram.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, KgToPound.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, MeterToCm.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeetToMeter.this, Speed.class);
                startActivity(intent);
            }
        });



    }
}