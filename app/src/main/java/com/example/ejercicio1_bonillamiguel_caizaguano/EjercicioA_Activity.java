package com.example.ejercicio1_bonillamiguel_caizaguano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EjercicioA_Activity extends AppCompatActivity {

    private EditText editText_valor1;
    private EditText editText_valor2;
    private TextView textView_res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_aactivity);

        editText_valor1 = findViewById(R.id.editText_valor1_suma);
        editText_valor2 = findViewById(R.id.editText_valor2_suma);
        textView_res = findViewById(R.id.textView_resultado);

    }

    public void Suma(View view){
        String v1, v2, espacio = "", resultado = "", data[];
        long n1, n2, suma;
        data = new String[5];
        v1 = editText_valor1.getText().toString();
        v2 = editText_valor2.getText().toString();
        n1 = Long.parseLong(v1);
        n2 = Long.parseLong(v2);
        data[0] = " ";
        data[1] = v1;
        data[2] = v2;
        data[3] = "";
        data[4] = "";

        for (int i = 0; i < v2.length() + 2; i++){
            data[3] += "-";
        }



        String valorTotal = String.valueOf(SumaAcarreo(n1, n2));
        data[4] = valorTotal.toString();

        final int size = data.length;

        for (int i = 0; i < size; i++)
        {
            resultado += (data[i] + "\n");
        }

        textView_res.setText(resultado);
    }


    public static long SumaAcarreo(long num1, long num2){
        long acarreo;
        while (num2 != 0){
            acarreo = num1 & num2;
            num1 = num1 ^ num2;
            num2 = acarreo << 1;
        }
        return num1;
    }


    public static String SumaR(String num1, String num2) {
        String res = null;
        int a = Math.abs(num1.length() - num2.length());
        if (num1.length() > num2.length()) {
            for (int i = 0; i < a; i++) {
                num2 = "0" + num2;
            }
        } else {
            for (int i = 0; i < a; i++) {
                num1 = "0" + num1;
            }
        }
        res = num1 + "\n" + num2;

    }

}