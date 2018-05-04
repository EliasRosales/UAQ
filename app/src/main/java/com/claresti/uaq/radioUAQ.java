package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class radioUAQ extends AppCompatActivity {

    FloatingActionMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_uaq);

        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
    }

    public void Tvuaq(View view){
        Intent i = new Intent(radioUAQ.this, tvUAQ.class);
        startActivity(i);
    }

    public void Ruaq(View view){
        Toast.makeText(this,"Ya te encuentras en esa ventana", Toast.LENGTH_SHORT).show();
    }

    public void Alumnos(View view){
        Intent i = new Intent(radioUAQ.this, alumnos.class);
        startActivity(i);
    }

    public void Docentes(View view){
        Intent i = new Intent(radioUAQ.this, docentes.class);
        startActivity(i);
    }
    public void Acerca(View view){
        Intent i = new Intent(radioUAQ.this, Acerca.class);
        startActivity(i);
    }
}
