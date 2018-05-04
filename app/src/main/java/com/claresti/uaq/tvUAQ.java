package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class tvUAQ extends AppCompatActivity {

    FloatingActionMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_uaq);

        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
    }

    public void Tvuaq(View view){
        Toast.makeText(this,"Ya te encuentras en esa ventana", Toast.LENGTH_SHORT).show();

    }

    public void Ruaq(View view){
        Intent i = new Intent(tvUAQ.this, radioUAQ.class);
        startActivity(i);
    }

    public void Alumnos(View view){
        Intent i = new Intent(tvUAQ.this, alumnos.class);
        startActivity(i);
    }

    public void Docentes(View view){
        Intent i = new Intent(tvUAQ.this, docentes.class);
        startActivity(i);
    }
    public void Acerca(View view){
        Intent i = new Intent(tvUAQ.this, Acerca.class);
        startActivity(i);
    }
}
