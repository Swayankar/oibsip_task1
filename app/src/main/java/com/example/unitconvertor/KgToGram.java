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

public class KgToGram extends AppCompatActivity {

    EditText kg_text;
    Button kg_converter;
    TextView kg_result;
    ImageView g_kg, kg_pound, m_feet, temp, m_cm, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_gram);

        g_kg = findViewById(R.id.g_kg);
        kg_text = findViewById(R.id.kg_text);
        kg_converter = findViewById(R.id.kg_converter);
        kg_pound = findViewById(R.id.kg_pound);
        m_feet = findViewById(R.id.m_feet);
        temp = findViewById(R.id.temp);
        m_cm = findViewById(R.id.m_cm);
        speed = findViewById(R.id.speed);
        kg_result = findViewById(R.id.kg_result);


        kg_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = kg_text.getText();
                int a = Integer.parseInt(String.valueOf(kg_text.getText()));
                kg_result.setText("Result: "+ input +" Kg is equal to "+a*1000+" Gram");
                kg_text.setText("");

            }
        });





//        try {
//            input = kg_text.getText();
//            int a = Integer.parseInt(String.valueOf(kg_text.getText()));
//            kg_result.setText("Result: "+ input +" Kilogram is equals to "+a*1000+" Gram");
//            kg_text.setText("");
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }


        g_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, GramToKg.class);
                startActivity(intent);
            }
        });


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, KgToPound.class);
                startActivity(intent);
            }
        });


        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, MeterToFeet.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, MeterToCm.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, Speed.class);
                startActivity(intent);
            }
        });

    }
}