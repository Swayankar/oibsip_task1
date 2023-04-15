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

public class Speed extends AppCompatActivity {

    EditText meter_text;
    Button speed_converter;
    TextView speed_result;
    ImageView kg_g, kg_pound, temp, m_feet, m_cm;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        meter_text = findViewById(R.id.meter_text);
        speed_converter = findViewById(R.id.speed_converter);
        kg_g = findViewById(R.id.kg_g);
        kg_pound = findViewById(R.id.kg_pound);
        temp = findViewById(R.id.temp);
        m_feet = findViewById(R.id.m_feet);
        m_cm = findViewById(R.id.m_cm);
        speed_result = findViewById(R.id.speed_result);


        speed_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = meter_text.getText();
                int a = Integer.parseInt(String.valueOf(meter_text.getText()));
                speed_result.setText("Result: "+ input +" Meter/Sec is equal to "+a*3.6+" Km/Hour");
                meter_text.setText("");

            }
        });


        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Speed.this, KgToGram.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Speed.this, KgToPound.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Speed.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Speed.this, MeterToFeet.class);
                startActivity(intent);
            }
        });

        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Speed.this, MeterToCm.class);
                startActivity(intent);
            }
        });

    }
}