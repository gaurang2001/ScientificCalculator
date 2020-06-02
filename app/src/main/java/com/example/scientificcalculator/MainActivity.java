package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initialise variables
    TextView textView, textView2, textView3;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_dot, b_equal,b_sign, btn, b_plus, b_minus, b_multiply, b_divide,b_backspace,b_percentage, b_log10, b_ln, b_root, b_xfac, b_sin, b_cos, b_tan,b_asin,b_acos,b_atan,b_ex, b_exponent;
    float result; // Stores number in textView
    float result2, result3=0; // Used when arithmetic or scientific functions are called
    boolean Add, Sub, Mul, Div, exp; // Stores truth value of function call
    int k=0;
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
        b_asin = findViewById(R.id.b_asin);
        b_acos = findViewById(R.id.b_acos);
        b_atan = findViewById(R.id.b_atan);
        b_ex = findViewById(R.id.b_ex);
        b_exponent = findViewById(R.id.b_exponent);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

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
                textView3.setText(textView3.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("Error") || textView.getText().equals("Infinity") || textView.getText().equals("0")) {
                    textView.setText("2");
                }
                else {
                    textView.setText(textView.getText() + "2");
                }
                textView3.setText(textView3.getText()+"2");
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
                textView3.setText(textView3.getText()+"3");
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
                textView3.setText(textView3.getText()+"4");
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
                textView3.setText(textView3.getText()+"5");
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
                textView3.setText(textView3.getText()+"6");
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
                textView3.setText(textView3.getText()+"7");
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
                textView3.setText(textView3.getText()+"8");
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
                textView3.setText(textView3.getText()+"9");
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
                textView3.setText(textView3.getText()+"0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
                textView3.setText(textView3.getText()+".");
            }

        });

        // Perform addition
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView3.getText().toString();

                if(Sub || Mul || Div){
                    Sub = Mul = Div = false;
                    textView3.setText(str.substring(0,str.length()-3)); // When two operators are pressed back to back
                }
                else if (Add && Float.parseFloat(textView.getText()+ "")==0) {
                    textView3.setText(str.substring(0,str.length()-3)); // When "+" is pressed back to back
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    result3=result+result3;
                    k++;
                }
                textView2.setText("+");
                textView3.setText(textView3.getText()+" + ");
                Add=true;
                textView.setText("0");


            }
        });

        // Perform subtraction
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView3.getText().toString();
                if(Add || Mul || Div){
                    Add = Mul = Div = false;
                    textView3.setText(str.substring(0,str.length()-3)); // When two operators are pressed back to back
                }
                else if (Sub && Float.parseFloat(textView.getText()+ "")==0) {
                    textView3.setText(str.substring(0,str.length()-3)); // When "-" is pressed back to back
                }
                else {
                    result = Float.parseFloat(textView.getText() + "");
                    if(k==0){
                        result3=result;
                        k++;
                    }
                    else
                        result3=result3-result;

                }
                textView2.setText("-");
                textView3.setText(textView3.getText()+" - ");
                Sub=true;
                textView.setText("0");

            }
        });

        // Perform multiplication
        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView3.getText().toString();
                if(Sub || Add || Div){
                    Sub = Add = Div = false;
                    textView3.setText(str.substring(0,str.length()-3)); // When two operators are pressed back to back
                }
                else if (Mul && Float.parseFloat(textView.getText()+ "")==0) {
                    textView3.setText(str.substring(0,str.length()-3)); // When "*" is pressed back to back
                }
                else{
                    result=Float.parseFloat(textView.getText()+ "");
                    if(k==0){
                    result3=result;
                    k++;
                    }
                    else
                        result3=result*result3;
                }
                textView2.setText("*");
                textView3.setText(textView3.getText()+" * ");
                Mul=true;
                textView.setText("0");
            }
        });

        // Perform division
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView3.getText().toString();
                if(Sub || Mul || Add){
                    Sub = Mul = Add = false;
                    textView3.setText(str.substring(0,str.length()-3)); // When two operators are pressed back to back
                }
                else if (Div && Float.parseFloat(textView.getText()+ "")==0) {
                    textView3.setText(str.substring(0,str.length()-3)); // When "/" is pressed back to back
                }
                else {
                    result = Float.parseFloat(textView.getText() + "");
                    if(k==0){
                        result3=result;
                        k++;
                    }
                    else
                        result3=result3/result;
                }
                textView2.setText("/");
                textView3.setText(textView3.getText()+" / ");
                Div=true;
                textView.setText("0");
            }
        });

        // Returns log -base 10- of the number
        b_log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                textView3.setText("log("+result+") = ");
                result = (float) Math.log10(result);
                textView2.setText("");
                textView.setText(result+"");
                textView3.setText(result+"");
            }
        });

        // Convert number to percentage
        b_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                result = result/100;
                textView2.setText("");
                textView.setText(result+"");
                textView3.setText(textView3.getText()+"%");
            }
        });

        // Returns log -base e- of the number
        b_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                textView3.setText("ln("+result+") = ");
                result = (float) Math.log(result);
                textView2.setText("");
                textView.setText(result+"");
                textView3.setText(result+"");
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
                    textView3.setText(textView3.getText().toString()+"*(-1)");
                }
            }
        });

        // Find root of the number
        b_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Float.parseFloat(textView.getText()+ "");
                textView.setText(Math.sqrt(result)+"");
                textView3.setText("\u221A"+result+" = "+textView.getText());
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
                    textView3.setText(Math.round(result)+"! = ");
                    float total = 1;
                    while (result > 1) {
                        total *= result;
                        result = result - 1;
                    }
                    textView2.setText("");
                    textView.setText(total + "");
                    textView3.setText(total+"");
                }
            }
        });

        // Deletes last character
        b_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textView.getText().toString();
                if (str.length() > 1 ) {
                    str = str.substring(0, str.length() - 1);
                    textView.setText(str);
                }
                else if (str.length() <= 1) {
                    textView.setText("0");
                }

                String str1 = textView3.getText().toString();
                textView3.setText(str1.substring(0, str1.length()-1));
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
                textView3.setText("sin("+degrees+") = "+result);
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
                textView3.setText("cos("+degrees+") = "+result);
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
                textView3.setText("tan("+degrees+") = "+result);
            }
        });

        b_asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float val = Float.parseFloat(textView.getText() + "");
                result = (float) Math.asin(val);
                result = (float) Math.toDegrees(result);
                textView.setText("" + result);
                textView3.setText("sin-1("+val+") = "+result);

            }
        });

        b_acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float val = Float.parseFloat(textView.getText() + "");
                result = (float) Math.acos(val);
                result = (float) Math.toDegrees(result);
                textView.setText("" + result);
                textView3.setText("cos-1("+val+") = "+result);

            }
        });

        b_atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float val = Float.parseFloat(textView.getText() + "");
                result = (float) Math.atan(val);
                result = (float) Math.toDegrees(result);
                textView.setText("" + result);
                textView3.setText("tan-1("+val+") = "+result);

            }
        });

        b_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                result = (float) Math.exp(result);
                textView2.setText("");
                textView.setText(result+"");
                textView3.setText("e^x"+"");
            }
        });



        // Performs power function
        b_exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Float.parseFloat(textView.getText()+ "");
                textView2.setText("y");
                exp = true;
                textView.setText(null);
            }
        });

        // Clears everything
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                textView2.setText("");
                textView3.setText("");
                result = result2 = result3=k=0;
                Add = Sub = Mul = Div = exp = false;
            }
        });

        // Returns final answer
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2=Float.parseFloat(textView.getText()+"");
                k=0;

                if(Add==true){
                    textView.setText(result2 + result3+"y"+result3);
                    float sum = result2+result3;
                    String str1 = textView3.getText().toString();
                    textView3.setText(str1+" = "+sum+"");
                    Add=false;
                    textView2.setText("");
                    result3=0;
                }
                if(Sub==true){
                    textView.setText(result3 - result2+"");
                    float diff = result3-result2;
                    String str1 = textView3.getText().toString();
                    textView3.setText(str1+" = "+diff+"");
                    Sub=false;
                    textView2.setText("");
                    result3=0;

                }
                if(Mul==true){
                    textView.setText(result3 * result2+"");
                    float prod = result3 * result2;
                    String str1 = textView3.getText().toString();
                    textView3.setText(str1+" = "+prod+"");
                    Mul=false;
                    textView2.setText("");
                    result3=0;
                }
                if(Div==true){
                    textView.setText(result3 / result2+"");
                    float div = result3/result2;
                    String str1 = textView3.getText().toString();
                    textView3.setText(str1+" = "+div+"");
                    Div=false;
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
