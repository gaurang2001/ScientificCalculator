package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_dot, b_equal, btn, b_plus, b_minus, b_multiply, b_divide;
    float result, result2;
    boolean Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b_dot = findViewById(R.id.b_dot);
        b_equal = findViewById(R.id.b_equal);
        btn = findViewById(R.id.b_ac);
        b_plus=findViewById(R.id.b_plus);
        b_minus=findViewById(R.id.b_minus);
        b_multiply=findViewById(R.id.b_multiply);
        b_divide=findViewById(R.id.b_divide);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    textView2.setText("+");
                    Add=true;
                    textView.setText(null);
            }}
        });
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    textView2.setText("-");
                    Sub=true;
                    textView.setText(null);
                }}
        });
        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    textView2.setText("*");
                    Mul=true;
                    textView.setText(null);
                }}
        });
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    textView2.setText("/");
                    Div=true;
                    textView.setText(null);
                }}
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
            }
        });
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2=Float.parseFloat(textView.getText()+"");
                if(Add==true){
                    textView.setText(result + result2+"");
                    Add=false;
                    textView2.setText("");
                }
                if(Sub==true){
                    textView.setText(result - result2+"");
                    Sub=false;
                    textView2.setText("");
                }
                if(Mul==true){
                    textView.setText(result * result2+"");
                    Mul=false;
                    textView2.setText("");
                }
                if(Div==true){
                    textView.setText(result / result2+"");
                    Div=false;
                    textView2.setText("");
                }
            }
        });

    }
}
