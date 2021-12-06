package com.example.ejercicio1_bonillamiguel_caizaguano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EjercicioA_Activity extends AppCompatActivity {

    private EditText editText_valor1;
    private EditText editText_valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_aactivity);

        editText_valor1 = findViewById(R.id.editText_valor1_suma);
        editText_valor2 = findViewById(R.id.editText_valor2_suma);

    }

    public void Suma(View view){
        String v1, v2;
        long n1, n2, suma;
        v1 = editText_valor1.getText().toString();
        v2 = editText_valor2.getText().toString();
        n1 = Long.parseLong(v1);
        n2 = Long.parseLong(v2);



    }
}