package com.example.ejercicio1_bonillamiguel_caizaguano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AbrirActivityA(View view){
        Intent intent = new Intent(this, EjercicioA_Activity.class);
        startActivity(intent);
    }

    public void AbrirActivityB(View view){
        Intent intent = new Intent(this, EjercicioB_Activity.class);
        startActivity(intent);
    }
}