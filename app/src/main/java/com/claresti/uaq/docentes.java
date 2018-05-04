package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class docentes extends AppCompatActivity {

    FloatingActionMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docentes);

        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
    }

    public void Tvuaq(View view){
        Intent i = new Intent(docentes.this, tvUAQ.class);
        startActivity(i);
    }

    public void Ruaq(View view){
        Intent i = new Intent(docentes.this, radioUAQ.class);
        startActivity(i);
    }

    public void Alumnos(View view){
        Intent i = new Intent(docentes.this, alumnos.class);
        startActivity(i);
    }

    public void Docentes(View view){
        Toast.makeText(this,"Ya te encuentras en esa ventana", Toast.LENGTH_SHORT).show();
    }
    public void Acerca(View view){
        Intent i = new Intent(docentes.this, Acerca.class);
        startActivity(i);
    }
}
