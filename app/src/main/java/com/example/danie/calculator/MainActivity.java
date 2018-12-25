package com.example.danie.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double p, q, res;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void addi(View view) {
       EditText et = findViewById(R.id.editText2);
       p = (double)Integer.parseInt(et.getText().toString());
       op = '+';
       et.setText("");

    }

    public void sub(View view) {
        EditText et = findViewById(R.id.editText2);
        p = (float)Integer.parseInt(et.getText().toString());
        op = '-';
        et.setText("");

    }

    public void mul(View view) {
        EditText et = findViewById(R.id.editText2);
        p = (float)Integer.parseInt(et.getText().toString());
        op = '*';
        et.setText("");

    }

   public void div(View view) {
       EditText et = findViewById(R.id.editText2);
       p = (float)Integer.parseInt(et.getText().toString());
       op = '/';
       et.setText("");

    }

    public void mod(View view) {
        EditText et = findViewById(R.id.editText2);
        p = (float)Integer.parseInt(et.getText().toString());
        op = '%';
        et.setText("");

    }

    public void squ(View view) {
        EditText et = findViewById(R.id.editText2);
        p = (float)Integer.parseInt(et.getText().toString());
        op = '^';
        et.setText("");

    }

    public void root(View view) {
        EditText et = findViewById(R.id.editText2);
        p = (float)Integer.parseInt(et.getText().toString());
        op = '$';
        res = (float) Math.sqrt(p);
        et.setText(""+res);
    }

    public void equal(View view) {
        EditText etc = findViewById(R.id.editText2);
            q = (float)Integer.parseInt(etc.getText().toString());
            switch (op) {
                case '+':
                    res = p + q;
                    break;
                case '-':
                    res = p - q;
                    break;
                case '*':
                    res = p * q;
                    break;
                case '/':
                    res = p / q;
                    break;
                case '%':
                    res = p % q;
                    break;
                case '^':
                    res = (float) Math.pow(p, q);
                    break;
                default:

            }

        etc.setText(""+res);

    }

    public void sin(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.sin(p);
        ed.setText(""+res);
    }

    public void cos(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.cos(p);
        ed.setText(""+res);
    }

    public void tan(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.tan(p);
        ed.setText(""+res);
    }

    public void asin(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.asin(p);
        ed.setText(""+res);
    }

    public void acos(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.acos(p);
        ed.setText(""+res);
    }

    public void atan(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.atan(p);
        ed.setText(""+res);
    }

    public void log(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        res = Math.log(p);
        ed.setText(""+res);
    }

    public void fact(View view){
        EditText ed = findViewById(R.id.editText2);
        p=(double)Integer.parseInt(ed.getText().toString());
        double fact = 1,i;
        for(i=p;i>0;i--){
            fact = fact*i;
        }
        ed.setText(""+fact);
    }

}