package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta2 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d;
    int calificacion= 0;
    Intent i, recibe;
    Bundle bolsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta2);

        i = new Intent(Pregunta2.this,Pregunta3.class);
        a = (Button)findViewById(R.id.a2);
        b = (Button)findViewById(R.id.b2);
        c = (Button)findViewById(R.id.c2);
        d = (Button)findViewById(R.id.d2);

        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("calificacion");

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

            case R.id.a2:

                calificacion += 500000;

                break;

            case R.id.b2:

                calificacion += 250000;

                break;

            case R.id.c2:

                calificacion += 1000000;


                break;

            case R.id.d2:

                calificacion += 600000;


                break;

            default:
                break;
        }
        i.putExtra("valor a pagar",calificacion);
        startActivity(i);
    }
}
