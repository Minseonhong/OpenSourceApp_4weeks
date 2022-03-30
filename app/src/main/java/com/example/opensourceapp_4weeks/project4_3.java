package com.example.opensourceapp_4weeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.MotionEvent;
import android.widget.Toast;

public class project4_3 extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRemain;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project4_3);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById((R.id.BtnMul));
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRemain = (Button) findViewById(R.id.BtnRemain);

        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length()==0 || edit2.getText().length()==0) {
                    Toast.makeText(project4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 = " + result.toString());
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length()==0 || edit2.getText().length()==0) {
                    Toast.makeText(project4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 = " + result.toString());
                }

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length()==0 || edit2.getText().length()==0) {
                    Toast.makeText(project4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 = " + result.toString());
                }

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length()==0 || edit2.getText().length()==0) {
                    Toast.makeText(project4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else
                if(edit2.getText().toString().equals("0"))
                {
                    Toast.makeText(project4_3.this, "0이 아닌 다른 수를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textResult.setText("계산 결과 = " + result.toString());
                }

            }
        });
        btnRemain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length()==0 || edit2.getText().length()==0) {
                    Toast.makeText(project4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else
                    if(edit2.getText().toString().equals("0"))
                    {
                        Toast.makeText(project4_3.this, "0이 아닌 다른 수를 입력해주세요", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textResult.setText("계산 결과 = " + result.toString());
                    }
            }
        });
    }
}