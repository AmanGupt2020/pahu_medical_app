package com.example.pashu_medical_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cowD extends AppCompatActivity {
    private Button first;
    private Button second;
    private Button third;
    private Button fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow_d);
        first=findViewById(R.id.c1);
        second=findViewById(R.id.c2);
        third=findViewById(R.id.c3);
        fourth=findViewById(R.id.c4);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cowD.this,cowD_1.class);
                startActivity(intent);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cowD.this,cowD_2.class);
                startActivity(intent);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cowD.this,cowD_3.class);
                startActivity(intent);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cowD.this,cowD_4.class);
                startActivity(intent);
            }
        });
    }
}