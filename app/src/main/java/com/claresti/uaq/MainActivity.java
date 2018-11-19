package com.claresti.uaq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btncalendario, btncalendarioCerrar;
    LayoutInflater layoutInflater;
    View popupView;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalendario = findViewById(R.id.btn_calendario);
        btncalendarioCerrar = findViewById(R.id.btn_calendario_cerrar);

        btncalendario.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                layoutInflater =(LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                popupView = layoutInflater.inflate(R.layout.calendario, null);
                popupWindow = new PopupWindow(popupView, RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
                btncalendario.setVisibility(View.GONE);
                btncalendarioCerrar.setVisibility(View.VISIBLE);

                btncalendarioCerrar.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btncalendarioCerrar.setVisibility(View.GONE);
                        btncalendario.setVisibility(View.VISIBLE);
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btncalendario);
            }
        });

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

    public void btnTUAQ(View view){
        Intent i = new Intent(MainActivity.this, tUAQ.class);
        startActivity(i);
    }

    public void btnContacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    public void uaq(View view){
        Uri uri = Uri.parse("http://www.uaq.mx");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



}
