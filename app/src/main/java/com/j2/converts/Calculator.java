package com.j2.converts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private EditText valueInput;


    public static int row = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        valueInput = (EditText) findViewById(R.id.editText);


        valueInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString() != null && !s.toString().isEmpty()) {
                    float value = Float.valueOf(s.toString());
                if (row == 0) {
                        textView3.setText(String.valueOf(value * 1.18853));
                    }
                else if(row == 1) {
                    textView3.setText(String.valueOf(value * 0.841003));
                }
                else if(row == 2) {
                    textView3.setText(String.valueOf(value * 0.890945));
                }
                else if(row == 3) {
                    textView3.setText(String.valueOf(value * 1.12233));
                }
                else if(row == 4) {
                    textView3.setText(String.valueOf(value * 125.325));
                }
                else if(row == 5) {
                    textView3.setText(String.valueOf(value * 0.00798003));
                }
                }

            }


        });
        if (row == 0) {
            textView1.setText("Euro:");
            textView2.setText("Dollars:");
        }
        else if(row == 1){
            textView1.setText("Dollars:");
            textView2.setText("Euro:");
        }
        else if(row == 2){
            textView1.setText("Euro:");
            textView2.setText("Pound:");
        }
        else if(row == 3){
            textView1.setText("Pound:");
            textView2.setText("Euro:");
        }
        else if(row == 4){
            textView1.setText("Euro:");
            textView2.setText("Yen:");
        }
        else if(row == 5){
            textView1.setText("Yen:");
            textView2.setText("Euro:");
        }
    }
}





