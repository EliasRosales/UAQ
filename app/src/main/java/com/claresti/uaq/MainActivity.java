package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity{


    FloatingActionMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
    }

    public void Tvuaq(View view){
        Intent i = new Intent(MainActivity.this, tvUAQ.class);
        startActivity(i);
    }

    public void Ruaq(View view){
        Intent i = new Intent(MainActivity.this, radioUAQ.class);
        startActivity(i);    }

    public void Alumnos(View view){
        Intent i = new Intent(MainActivity.this, alumnos.class);
        startActivity(i);
    }

    public void Docentes(View view){
        Intent i = new Intent(MainActivity.this, docentes.class);
        startActivity(i);
    }
    public void Acerca(View view){
        Intent i = new Intent(MainActivity.this, Acerca.class);
        startActivity(i);
    }

    public void Facultades(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }
    public void Contacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

}
