package com.example.ejercicio1_bonillamiguel_caizaguano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EjercicioB_Activity extends AppCompatActivity {

    EditText editextValor1;
    EditText editextValor2;
    EditText editextResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_bactivity);

        editextValor1 = findViewById(R.id.editTextTextValor1);
        editextValor2 = findViewById(R.id.editTextTextValor2);
        editextResultado = findViewById(R.id.editTextTextResultado);

    }

    public void restar (View view) {
         long numero1 = Long.parseLong(editextResultado.getText().toString());
        long numero2 = Long.parseLong(editextResultado.getText().toString());

        long  resultado = numero1 - numero2;



    }


}