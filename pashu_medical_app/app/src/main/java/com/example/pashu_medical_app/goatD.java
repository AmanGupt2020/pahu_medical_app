package com.example.pashu_medical_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goatD extends AppCompatActivity {
    private Button first;
    private Button second;
    private Button third;
    private Button fourth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goat_d);
        first=findViewById(R.id.g1);
        second=findViewById(R.id.g2);
        third=findViewById(R.id.g3);
        fourth=findViewById(R.id.g4);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(goatD.this,goatD_1.class);
                startActivity(intent);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(goatD.this,goatD_2.class);
                startActivity(intent);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(goatD.this,goatD_3.class);
                startActivity(intent);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(goatD.this,goatD_4.class);
                startActivity(intent);
            }
        });
    }
}