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

public class KelvinToCelcius extends AppCompatActivity {

    EditText temp_text;
    Button kelvin_converter;
    TextView kelvin_result;
    ImageView c_kel, kg_g, kg_pound, m_feet, m_cm, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_to_celcius);

        temp_text = findViewById(R.id.temp_text);
        kelvin_converter = findViewById(R.id.kelvin_converter);
        kg_g = findViewById(R.id.kg_g);
        m_feet = findViewById(R.id.m_feet);
        kg_pound = findViewById(R.id.kg_pound);
        m_cm = findViewById(R.id.m_cm);
        speed = findViewById(R.id.speed);
        c_kel = findViewById(R.id.c_kel);
        kelvin_result = findViewById(R.id.kelvin_result);


        kelvin_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = temp_text.getText();
                int a = Integer.parseInt(String.valueOf(temp_text.getText()));
                kelvin_result.setText("Result: "+ input +" Kelvin is equal to "+(a-273.15)+" Celcius");
                temp_text.setText("");


            }
        });


        c_kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });


        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, KgToGram.class);
                startActivity(intent);
            }
        });


        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, MeterToFeet.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, KgToPound.class);
                startActivity(intent);
            }
        });

        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, MeterToCm.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KelvinToCelcius.this, Speed.class);
                startActivity(intent);
            }
        });

    }
}