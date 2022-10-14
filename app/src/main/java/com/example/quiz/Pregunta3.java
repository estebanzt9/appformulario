package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta3 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d;
    int calificacion= 0;
    Intent i, recibe;
    Bundle bolsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3);

        i = new Intent(Pregunta3.this,Pregunta4.class);
        a = (Button)findViewById(R.id.a3);
        b = (Button)findViewById(R.id.b3);
        c = (Button)findViewById(R.id.c3);
        d = (Button)findViewById(R.id.d3);

        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("valor a pagar");

        } catch (Exception e) {

            Toast.makeText(this,"Error al recibir datos", Toast.LENGTH_SHORT).show();

        }


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.a3:

                calificacion += 600000;

                break;

            case R.id.b3:

                calificacion += 1000000;

                break;

            case R.id.c3:

                calificacion += 650000;


                break;

            case R.id.d3:

                calificacion += 150000;


                break;

            default:
                break;
        }
        i.putExtra("Valor a pagar",calificacion);
        startActivity(i);
    }
}
