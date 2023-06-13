package com.tufanakcay.androidcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox m_java, m_kotlin, m_python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setMessage();
    }

    private void init() {
        m_java = findViewById(R.id.chb_java);
        m_kotlin = findViewById(R.id.chb_kotlin);
        m_python = findViewById(R.id.chb_python);

    }

    private void setMessage() {

        m_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m_java.isChecked()) {

                    Toast.makeText(MainActivity.this, m_java.getText() + " selected", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(MainActivity.this, m_java.getText() + " not selected", Toast.LENGTH_LONG).show();
                }
            }
        });

        m_kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m_kotlin.isChecked()) {

                    Toast.makeText(MainActivity.this, m_kotlin.getText() + " selected", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(MainActivity.this, m_kotlin.getText() + " not selected", Toast.LENGTH_LONG).show();
                }
            }
        });


        m_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m_python.isChecked()) {

                    Toast.makeText(MainActivity.this, m_python.getText() + " selected", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(MainActivity.this, m_python.getText() + " not selected", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}