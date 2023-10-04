package com.example.pashu_medical_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dogD extends AppCompatActivity {
    private Button first;
    private Button second;
    private Button third;
    private Button fourth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_d);
        first=findViewById(R.id.d1);
        second=findViewById(R.id.d2);
        third=findViewById(R.id.d3);
        fourth=findViewById(R.id.d4);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dogD.this,dogD_1.class);
                startActivity(intent);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dogD.this,dogD_2.class);
                startActivity(intent);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dogD.this,dogD_3.class);
                startActivity(intent);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dogD.this,dogD_4.class);
                startActivity(intent);
            }
        });
    }
}