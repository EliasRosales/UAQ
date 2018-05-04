package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnTv(View view){
        Intent i = new Intent(MainActivity.this, tvUAQ.class);
        startActivity(i);
    }

    public void btnRadio(View view){
        Intent i = new Intent(MainActivity.this, radioUAQ.class);
        startActivity(i);    }

    public void btnAlumnos(View view){
        Intent i = new Intent(MainActivity.this, alumnos.class);
        startActivity(i);
    }

    public void btnDocentes(View view){
        Intent i = new Intent(MainActivity.this, docentes.class);
        startActivity(i);
    }
    public void btnAcerca(View view){
        Intent i = new Intent(MainActivity.this, Acerca.class);
        startActivity(i);
    }

    public void btnFacultades(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }
    public void btnContacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

}
