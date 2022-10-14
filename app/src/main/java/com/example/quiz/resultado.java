package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class resultado extends AppCompatActivity {

    Intent i,recibe;
    Bundle bolsa;
    int calificacion = 0;
    Button empezar;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        empezar = (Button) findViewById(R.id.empezar);
        txt = (TextView)findViewById(R.id.resultado);
        i = new Intent(resultado.this,MainActivity.class);
        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("valor matricula");

            if (calificacion==0){

                txt.setText("N/A");

            } else if (calificacion == 670000){

                txt.setText("No habrá descuento");

            } else if (calificacion == 950000){

                txt.setText("Tendras descuento del 3% por pago a tiempo.");

            } else if (calificacion == 1000450){

                txt.setText("Tendras descuento del 5% por pago oportuno.");

            } else if (calificacion == 500000){

                txt.setText("Tendras descuento del 10% por pago anticipado.");

            }

        } catch (Exception e) {

            Toast.makeText(this,"Error al inscribir al alumno en los datos", Toast.LENGTH_SHORT).show();

        }

        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });


    }
}
