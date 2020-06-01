package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initialise variables
    TextView textView, textView2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_dot, b_equal,b_sign, btn, b_plus, b_minus, b_multiply, b_divide,b_backspace,b_percentage, b_log10, b_ln, b_root, b_xfac, b_sin, b_cos, b_tan, b_exponent;
    float result; // Stores number in textView
    float result2; // Used when arithmetic or scientific functions are called
    boolean Add, Sub, Mul, Div, root_base, exp; // Stores truth value of function call

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_sign = findViewById(R.id.b_sign);
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
        b_backspace = findViewById(R.id.b_backspace);
        b_percentage = findViewById(R.id.b_percentage);
        b_dot = findViewById(R.id.b_dot);
        b_equal = findViewById(R.id.b_equal);
        btn = findViewById(R.id.b_ac);
        b_plus = findViewById(R.id.b_plus);
        b_minus = findViewById(R.id.b_minus);
        b_multiply = findViewById(R.id.b_multiply);
        b_divide = findViewById(R.id.b_divide);
        b_log10 = findViewById(R.id.b_log10);
        b_ln = findViewById(R.id.b_ln);
        b_root = findViewById(R.id.b_root);
        b_xfac = findViewById(R.id.b_xfac);
        b_sin = findViewById(R.id.b_sin);
        b_cos = findViewById(R.id.b_cos);
        b_tan = findViewById(R.id.b_tan);
        b_exponent = findViewById(R.id.b_exponent);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        // Default value of textView is always 0
        textView.setText("" + 0);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")){
                    textView.setText(("1"));
                }
                else {
                    textView.setText(textView.getText() + "1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                }
                else {
                    textView.setText(textView.getText() + "2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("3"));
                }
                else {
                    textView.setText(textView.getText() + "3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("4"));
                }
                else {
                    textView.setText(textView.getText() + "4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("5"));
                }
                else {
                    textView.setText(textView.getText() + "5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("6"));
                }
                else {
                    textView.setText(textView.getText() + "6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("7"));
                }
                else {
                    textView.setText(textView.getText() + "7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("8"));
                }
                else {
                    textView.setText(textView.getText() + "8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText(("9"));
                }
                else {
                    textView.setText(textView.getText() + "9");
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText((""));
                }
                else {
                    textView.setText(textView.getText() + "0");
                }
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });

        // Perform addition
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("+");
                Add=true;
                textView.setText("0");
            }
        });

        // Perform subtraction
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("-");
                Sub=true;
                textView.setText("0");
            }
        });

        // Perform multiplication
        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("*");
                Mul=true;
                textView.setText("0");
            }
        });

        // Perform division
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("/");
                Div=true;
                textView.setText("0");
            }
        });

        // Returns log -base 10- of the number
        b_log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                result = (float) Math.log10(result);
                textView2.setText("");
                textView.setText(result+"");
            }
        });

        // Convert number to percentage
        b_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                result2 = result / 100;
                textView2.setText("");
                textView.setText(result2+"");
            }
        });

        // Returns log -base e- of the number
        b_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                result = (float) Math.log(result);
                textView2.setText("");
                textView.setText(result+"");
            }

        });

        // Change sign of number
        b_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result1 = Float.parseFloat(textView.getText()+ "");
                if(result1 != 0) {
                    result1 = result1 * -1;
                    textView2.setText("");
                    textView.setText(result1+"");
                }
            }
        });

        // Find root of the number
        // TODO: Change code
        b_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("y");
                root_base=true;
                textView.setText(null);
            }
        });

        // Returns factorial of number
        b_xfac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                if (result != Math.round(result))
                {
                    textView2.setText("");
                    textView.setText("Error");
                }
                else {
                    float total = 1;
                    while (result > 1) {
                        total *= result;
                        result = result - 1;
                    }
                    textView2.setText("");
                    textView.setText(total + "");
                }
            }
        });

        // Deletes last character
        b_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    textView.setText(str);
                } else if (str.length() <= 1 ) {
                    textView.setText("0");
                  }
            }
        });

        // Returns sine of the number
        b_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees = Float.parseFloat(textView.getText() + "");
                double radians = Math.toRadians(degrees);
                result = (float) Math.sin(radians);
                textView.setText("" + result);
            }
        });

        // Returns cosine of the number
        b_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees = Float.parseFloat(textView.getText() + "");
                double radians = Math.toRadians(degrees);
                result = (float) Math.cos(radians);
                textView.setText("" + result);
            }
        });

        // Returns tangent of the number
        b_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees = Float.parseFloat(textView.getText() + "");
                double radians = Math.toRadians(degrees);
                result = (float) Math.tan(radians);
                textView.setText("" + result);
            }
        });

        // Performs power function
        b_exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView2.setText("y");
                exp=true;
                textView.setText(null);
            }
        });

        // Clears everything
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                textView2.setText("");
                Add = Sub = Mul = Div = root_base = exp = false;
            }
        });

        // Returns final answer
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
                if (root_base==true){
                    textView.setText(Math.pow(result, 1/result2)+"");
                    root_base=false;
                    textView2.setText("");
                }

                if (exp==true){
                    textView.setText(Math.pow(result, result2)+"");
                    exp=false;
                    textView2.setText("");
                }
            }
        });

    }
}
