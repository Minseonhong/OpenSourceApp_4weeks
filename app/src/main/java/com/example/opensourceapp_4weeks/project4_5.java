package com.example.opensourceapp_4weeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class project4_5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project4_5);
        setTitle("이미지 번갈아보여주기");

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);

        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);

        img1.setImageResource(R.drawable.profile);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setVisibility(View.VISIBLE);
                img1.setImageResource(R.drawable.profile);
                img2.setVisibility(View.INVISIBLE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setVisibility(View.VISIBLE);
                img2.setImageResource(R.drawable.profile);
                img1.setVisibility(View.INVISIBLE);
            }
        });
    }
}