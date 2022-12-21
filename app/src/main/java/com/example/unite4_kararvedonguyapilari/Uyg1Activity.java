package com.example.unite4_kararvedonguyapilari;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {

    EditText sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        sayi = findViewById(R.id.editTextNumber);
    }
}
