package com.example.calculadoracodigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class Calculadora {

        public int add(String valores) {
            if (valores.isEmpty()) {
                return 0;
            }

            String[] valoresArray = valores.split(",");
            int total = 0;
            for (int indice = 0; indice < valoresArray.length; indice++) {
                total = total + Integer.parseInt(valoresArray[indice]);
            }
            return total;
        }
}