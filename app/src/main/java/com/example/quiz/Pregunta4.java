package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta4 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d;
    int calificacion= 0;
    Intent i, recibe;
    Bundle bolsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta4);

        i = new Intent(Pregunta4.this,Pregunta5.class);
        a = (Button)findViewById(R.id.a4);
        b = (Button)findViewById(R.id.b4);
        c = (Button)findViewById(R.id.c4);
        d = (Button)findViewById(R.id.d4);

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

            case R.id.a4:

                calificacion += 345005;

                break;

            case R.id.b4:

                calificacion += 400000;

                break;

            case R.id.c4:

                calificacion += 750000;


                break;

            case R.id.d4:


                calificacion += 250000;


                break;

            default:
                break;
        }
        i.putExtra("valor a pagar",calificacion);
        startActivity(i);
    }
}
