package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    TextView etiResult;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1= findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        etiResult = findViewById(R.id.etiResult);

    }

    public void onClick(View view) {

        num1 = Integer.parseInt(text1.getText().toString());
        num2 = Integer.parseInt(text2.getText().toString());

        switch (view.getId()){
            case R.id.btn1: Sumar();
                break;
            case R.id.btn2: Restar();
                break;
            case R.id.btn3: Multiplicar();
                break;
            case R.id.btn4: Dividir();
                break;

        }
    }

    private void Sumar() {
        int suma = num1+num2;
        etiResult.setText("El resultado de la suma es: "+suma);
    }

    private void Restar() {
        int Resta = num1-num2;
        etiResult.setText("El resultado de la suma es: "+Resta);
    }

    private void Multiplicar() {
        int Multiplicacion = num1*num2;
        etiResult.setText("El resultado de la suma es: "+Multiplicacion);
    }

    private void Dividir(){
        if (num2>0){
            int Division = num1/num2;
            etiResult.setText("El resultado de la suma es: "+Division);
        }else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }


    }
}
