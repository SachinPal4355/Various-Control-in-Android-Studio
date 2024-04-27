package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup =findViewById(R.id.radioGroup);
        radioGroup .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.radioButton) {
                    Toast.makeText(MainActivity.this, "600 ft", Toast.LENGTH_LONG).show();

                } else if (i == R.id.radioButton2) {
                    Toast.makeText(MainActivity.this, "800 ft", Toast.LENGTH_LONG).show();

                } else if (i == R.id.radioButton3) {
                    Toast.makeText(MainActivity.this, "500 ft", Toast.LENGTH_LONG).show();


                }
            }
        });

    }
}