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

public class MeterToCm extends AppCompatActivity {

    EditText meter_text;
    Button cm_converter;
    TextView cm_result;
    ImageView cm_m, kg_g, kg_pound, temp, m_feet, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_cm);

        meter_text = findViewById(R.id.meter_text);
        cm_converter = findViewById(R.id.cm_converter);
        kg_g = findViewById(R.id.kg_g);
        kg_pound = findViewById(R.id.kg_pound);
        temp = findViewById(R.id.temp);
        m_feet = findViewById(R.id.m_feet);
        speed = findViewById(R.id.speed);
        cm_m = findViewById(R.id.cm_m);
        cm_result = findViewById(R.id.cm_result);


        cm_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = meter_text.getText();
                int a = Integer.parseInt(String.valueOf(meter_text.getText()));
                cm_result.setText("Result: "+ input +" Meter is equal to "+a*100+" Centimeter");
                meter_text.setText("");

            }
        });



        cm_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, CmToMeter.class);
                startActivity(intent);
            }
        });

        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, KgToGram.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, KgToPound.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, MeterToFeet.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToCm.this, Speed.class);
                startActivity(intent);
            }
        });

    }
}