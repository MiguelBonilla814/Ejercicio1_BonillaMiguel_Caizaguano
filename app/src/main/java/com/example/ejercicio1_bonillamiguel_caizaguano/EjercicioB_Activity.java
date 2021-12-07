package com.example.ejercicio1_bonillamiguel_caizaguano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EjercicioB_Activity extends AppCompatActivity {

    EditText editextValor1;
    EditText editextValor2;
    EditText editextResultado;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_bactivity);

        editextValor1 = findViewById(R.id.editTextTextValor1);
        editextValor2 = findViewById(R.id.editTextTextValor2);
        editextResultado = findViewById(R.id.editTextTextResultado);

    }

    public void restar (View view) {
         long numero1 = Long.parseLong(editextValor1.getText().toString());
        long numero2 = Long.parseLong(editextValor2.getText().toString());

        long  resultado = numero1 - numero2;

        editextResultado.setText(String.valueOf(resultado));


    }

/*
    public static String minus(String firstNum, String secondNum){
        result = "";
        String sign = "";
        if(firstNum.equals(secondNum)){
            return "0";
        }
        // Número decimal-grande, intercambia firstNum y secondNum, y establece el signo en-
        if(firstNum.length() < secondNum.length()
                || (firstNum.length() == secondNum.length() && firstNum.compareTo(secondNum) < 0)){
            sign = "-";
            String tmp = firstNum;
            firstNum = secondNum;
            secondNum = tmp;
        }
        // Si el decimal (secondNum) no es suficiente, agregue 0 al orden superior
        while(secondNum.length() < firstNum.length()){
            secondNum = "0" + secondNum;
        }
        // Los números grandes comienzan desde el bit bajo y disminuyen el número poco a poco
        int index = firstNum.length() - 1;
        int préstamos = 0; // Grabar préstamos
        while(index >= 0){
            int left = firstNum.charAt(index) - secondNum.charAt(index) + borrow;
            if(left < 0){
                borrow = -1;
                left += 10;
            }
            result = left + result;
            index--;
        }
        // Eliminar el exceso de 0 inicial
        while(result.indexOf("0") == 0){
            result = result.substring(1);
        }
        return sign + result;
    }
*/

}