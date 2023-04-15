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

public class PoundToKg extends AppCompatActivity {

    EditText pound_text;
    Button pound_converter;
    TextView pound_result;
    ImageView kg_pound, kg_g, m_feet, temp, m_cm, speed;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound_to_kg);

        pound_text = findViewById(R.id.pound_text);
        pound_converter = findViewById(R.id.pound_converter);
        kg_g = findViewById(R.id.kg_g);
        m_feet = findViewById(R.id.m_feet);
        temp = findViewById(R.id.temp);
        m_cm = findViewById(R.id.m_cm);
        speed = findViewById(R.id.speed);
        kg_pound = findViewById(R.id.kg_pound);
        pound_result = findViewById(R.id.pound_result);


        pound_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = pound_text.getText();
                int a = Integer.parseInt(String.valueOf(pound_text.getText()));
                pound_result.setText("Result: "+ input +" Pound is equal to "+(a*0.45)+" Kg");
                pound_text.setText("");

            }
        });

//        try {
//            input = pound_text.getText();
//            int a = Integer.parseInt(String.valueOf(pound_text.getText()));
//            pound_result.setText("Result: "+ input +" Kilogram is equals to "+a*(2.20462)+" Gram");
//            pound_text.setText("");
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }


        kg_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, KgToPound.class);
                startActivity(intent);
            }
        });


        kg_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, KgToGram.class);
                startActivity(intent);
            }
        });


        m_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, MeterToFeet.class);
                startActivity(intent);
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, CelciusToKelvin.class);
                startActivity(intent);
            }
        });

        m_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, MeterToCm.class);
                startActivity(intent);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoundToKg.this, Speed.class);
                startActivity(intent);
            }
        });

    }
}