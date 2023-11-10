package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import  java.math.*;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity2 extends AppCompatActivity {

    Button change,change2;
    LinearLayout buttons2,buttons;
    TextView inputTxt,outputtxt;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        outputtxt  = findViewById(R.id.outputtxt);
        inputTxt = findViewById(R.id.inputText);

        change = findViewById(R.id.change);
        change2 = findViewById(R.id.btn_change_2);

        buttons = (LinearLayout) findViewById(R.id.buttons);
        buttons2 = (LinearLayout) findViewById(R.id.buttons2);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttons.setVisibility(View.INVISIBLE);
                buttons2.setVisibility(View.VISIBLE);
            }
        });

        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttons.setVisibility(View.VISIBLE);
                buttons2.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void btn_0(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "0");
    }
    public void btn_1(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "1");
    }
    public void btn_2(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "2");
    }

    public void btn_3(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "3");
    }
    public void btn_4(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "4");
    }
    public void btn_5(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "5");
    }
    public void btn_6(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "6");
    }
    public void btn_7(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "7");
    }
    public void btn_8(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "8");
    }
    public void btn_9(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "9");
    }


    public  void btn_dot(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%'|| str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
            str = str.substring(0, str.length() - 1);
            inputTxt.setText(str);
        }else {
            inputTxt.setText(data + ".");
        }
    }

    public void pluse(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%'|| str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
            str = str.substring(0, str.length() - 1);
            inputTxt.setText(str);
        }else {
            if(str !=null && str.length()>0) {
                inputTxt.setText(data + "+");
            }
        }
    }
    public void btn_ac(View view){
        inputTxt.setText("");
        outputtxt.setText("");
    }
    public  void btn_module(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%' || str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
            str = str.substring(0, str.length() - 1);
            inputTxt.setText(str);
        }else {
            if(str !=null && str.length()>0) {
                inputTxt.setText(data + "%");
            }
        }
    }
    public  void btn_devide(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%'|| str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
            str = str.substring(0, str.length() - 1);
            inputTxt.setText(str);
        }else {
            if(str !=null && str.length()>0) {
                inputTxt.setText(data + "/");
            }
        }
    }

    public  void btn_minus(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%'|| str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
            str = str.substring(0, str.length() - 1);
            inputTxt.setText(str);
        }else {
            if(str !=null && str.length()>0) {
                inputTxt.setText(data + "-");
            }
        }
    }
    public void btn_multiplication(View view){
                data = inputTxt.getText().toString();
                String str = data;
                if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*'|| str.charAt(str.length() - 1) == '-'|| str.charAt(str.length() - 1) == '+'|| str.charAt(str.length() - 1) == '%'|| str.charAt(str.length() - 1) == '/'|| str.charAt(str.length() - 1) == '.')) {
                    str = str.substring(0, str.length() - 1);
                    inputTxt.setText(str);
                }else {
                    if(str !=null && str.length()>0) {
                        inputTxt.setText(data + "*");
                    }
                }
    }
    public void btn_clear(View view){
        data = inputTxt.getText().toString();
        String str = data;
        if (str != null && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        inputTxt.setText(str);
    }
    public  void btn_sin(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "sin(");
    }
    public  void btn_cos(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "Cos(");
    }
    public  void btn_tan(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "Tan(");
    }
    public  void btn_root(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "root(");
    }
    public  void btn_lg(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "lg(");
    }
    public  void btn_ln(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "ln(");
    }
    public  void btn_pi(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + "3.14155");
    }
    public  void btn_factorial(View view){
        data = inputTxt.getText().toString();
        String str = data;
        try {
            int i = str.length() - 1;
            while (i > 0) {
                if ((!str.isEmpty()) && (str.charAt(str.length() - i) == '*' || str.charAt(str.length() - i) == '-' || str.charAt(str.length() - i) == '+' || str.charAt(str.length() - i) == '%' || str.charAt(str.length() - i) == '.' || str.charAt(str.length() - i) == '/')) {
                    break;
                } else {
                    i = i - 1;
                }
            }
            String s = "";

            while (i < str.length()) {

                char c = str.charAt(i);
                String d = String.valueOf(c);
                s = s + d;
                i = i + 1;
            }

            int a = Integer.parseInt(s);

            int sum = 1;
            for (int k = 1; k <= a; k++) {
                sum = sum * k;
            }
            data = data.substring(0, i - 1);
            inputTxt.setText(data + String.valueOf(sum));
        }catch (Exception e){
            outputtxt.setText("enter first value");
        }

    }
    public void btn_right_parenthesis(View view){
        data = inputTxt.getText().toString();
        inputTxt.setText(data + ")");
        try {
            if(data.charAt(data.length()-5)=='s'){
                int z = (int) data.charAt(data.length()-1);
                int a = z-48;
                double b= Math.toRadians(a);
                double c = Math.sin(b);
                data = data.substring(0, data.length() - 5);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(d);
            }else if(data.charAt(data.length()-6)=='s'){
                double m = (double)data.charAt(data.length()-1);
                double n = (double)data.charAt(data.length()-2);
                double a = ((n-48)*10)+(m-48);
                double b= Math.toRadians(a);
                double c = Math.sin(b);
                data = data.substring(0, data.length() - 6);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data + d);
            }
             else if(data.charAt(data.length()-5)=='C'){
                int z = (int) data.charAt(data.length()-1);
                int a = z-48;
                double b= Math.toRadians(a);
                double c = Math.cos(b);
                data = data.substring(0, data.length() - 5);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data+d);
            }
             else if(data.charAt(data.length()-6)=='C'){
                double m = (double)data.charAt(data.length()-1);
                double n = (double)data.charAt(data.length()-2);
                double a = ((n-48)*10)+(m-48);
                double b= Math.toRadians(a);
                double c = Math.cos(b);
                data = data.substring(0, data.length() - 6);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data + d);
            }
            else if(data.charAt(data.length()-5)=='T'){
                int z = (int) data.charAt(data.length()-1);
                int a = z-48;
                double b= Math.toRadians(a);
                double c = Math.tan(b);
                data = data.substring(0, data.length() - 5);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data + d);
            }
            else if(data.charAt(data.length()-6)=='T'){
                double m = (double)data.charAt(data.length()-1);
                double n = (double)data.charAt(data.length()-2);
                double a = ((n-48)*10)+(m-48);
                double b= Math.toRadians(a);
                double c = Math.tan(b);
                data = data.substring(0, data.length() - 6);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data + d);
            }
            else if(data.charAt(data.length()-6)=='r'){
                double m = (double)data.charAt(data.length()-1);
                m = m-48;
                double c = Math.sqrt(m);
                data = data.substring(0, data.length() - 6);
                String d= String.valueOf(c);
                inputTxt.setText(data + d);
            }
            else if(data.charAt(data.length()-4)=='l'){
                double m = (double)data.charAt(data.length()-1);
                m = m-48;
                double c = Math.log10(m);
                data = data.substring(0, data.length() - 4);
                String d= String.valueOf(c);
                d = d.substring(0,7);
                inputTxt.setText(data + d);
            }
        }catch (Exception e){
            outputtxt.setText("error accured");
        }


    }
    public  void btn_equal(View view){
        outputtxt  = findViewById(R.id.outputtxt);
        inputTxt = findViewById(R.id.inputText);
        data = inputTxt.getText().toString();
        String str = data;
        if(!str.isEmpty()) {
            if (str != null && str.length() > 0 && (str.charAt(str.length() - 1) == '*' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '%') || str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '/') {
                str = str.substring(0, str.length() - 1);

            } else {
                str = str.replaceAll("%", "/100");
                Context rhinno = Context.enter();
                rhinno.setOptimizationLevel(-1);

                String finalResult = "";
                Scriptable scriptable = rhinno.initSafeStandardObjects();
                finalResult = rhinno.evaluateString(scriptable, data, "Javascript", 1, null).toString();
                outputtxt.setText(finalResult);
            }
        }else{
            outputtxt.setText("enter value");
        }
    }

}
