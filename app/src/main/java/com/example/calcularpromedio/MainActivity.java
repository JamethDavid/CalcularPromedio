package com.example.calcularpromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText nota4;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1 =(EditText)findViewById(R.id.txt_nota1);
        nota2 =(EditText)findViewById(R.id.txt_nota2);
        nota3 =(EditText)findViewById(R.id.txt_nota3);
        nota4 =(EditText)findViewById(R.id.txt_nota4);
        textViewResultado=(TextView) findViewById(R.id.textViewResultado);
    }
    public void calcualar(View view){
        String nota1_String = nota1.getText().toString();
        String nota2_String = nota2.getText().toString();
        String nota3_String = nota3.getText().toString();
        String nota4_String = nota4.getText().toString();

        int nota1_int=Integer.parseInt(nota1_String);
        int nota2_int=Integer.parseInt(nota2_String);
        int nota3_int=Integer.parseInt(nota3_String);
        int nota4_int=Integer.parseInt(nota4_String);
        int promedio = (nota1_int+nota2_int+nota3_int+nota4_int)/4;
        if(promedio>=30){
            textViewResultado.setText("Alumno Aprobado con"+promedio);
        }else if(promedio<=29){
            textViewResultado.setText("Alumno Reprobado con"+promedio);

        }

    }
}