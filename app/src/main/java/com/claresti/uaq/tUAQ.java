package com.claresti.uaq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class tUAQ extends AppCompatActivity {

    FloatingActionMenu menu;
    ImageView juriquilla, aereopuerto, bicentenario, hjuriquilla, haereopuerto, hbicentenario;
    Button btn_juriquilla, btn_aereopuerto, btn_bicentenario;
    TextView tv_juriquilla, tv_aereopuerto, tv_bicentenario, textView;

    Button btncalendario, btncalendarioCerrar;
    LayoutInflater layoutInflater;
    View popupView;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_uaq);

        /*se cambia el texto del toobar*/
        textView= findViewById(R.id.titulo);
        textView.setText("TRANSPORTE UNIVERSITARIO");

        /*Se llama al floatingActionMenu*/
        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);

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

    /* Funcion que hace que al hacer click en la imagen del toolbar se redirija a la pagina web la la universisdad*/
    public void uaq(View view){
        Uri uri = Uri.parse("http://www.uaq.mx");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    /*Acciones del menu*/
    public void Tvuaq(View view){
        Intent i = new Intent(tUAQ.this, tvUAQ.class);
        startActivity(i);
    }

    public void Ruaq(View view){
        Intent i = new Intent(tUAQ.this, radioUAQ.class);
        startActivity(i);
    }

    public void Alumnos(View view){
        Intent i = new Intent(tUAQ.this, alumnos.class);
        startActivity(i);
    }

    public void Docentes(View view){
        Intent i = new Intent(tUAQ.this, docentes.class);
        startActivity(i);
    }

    public void Acerca(View view){
        Intent i = new Intent(tUAQ.this, Acerca.class);
        startActivity(i);
    }

    public void Facultades(View view){

        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    public void TUAQ(View view){
        Toast.makeText(this,"Ya te encuentras en esa ventana", Toast.LENGTH_SHORT).show();
    }

    public void Contacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    /*Fin menu*/

    /*Funciones de la ventana de tranportes uaq donde se muestran los horarios*/

    //funcion para mostrar el horario y ocultar las opciones

    public void imgJuriquilla(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        hjuriquilla = findViewById(R.id.h_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        btn_juriquilla = findViewById(R.id.btn_juriquilla);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.GONE);
        tv_juriquilla.setVisibility(View.GONE);
        bicentenario.setVisibility(View.GONE);
        tv_bicentenario.setVisibility(View.GONE);
        aereopuerto.setVisibility(View.GONE);
        tv_aereopuerto.setVisibility(View.GONE);
        menu.setVisibility(View.GONE);
        hjuriquilla.setVisibility(View.VISIBLE);
        btn_juriquilla.setVisibility(View.VISIBLE);
    }

    public void juriquilla(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        hjuriquilla = findViewById(R.id.h_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        btn_juriquilla = findViewById(R.id.btn_juriquilla);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.VISIBLE);
        tv_juriquilla.setVisibility(View.VISIBLE);
        bicentenario.setVisibility(View.VISIBLE);
        tv_bicentenario.setVisibility(View.VISIBLE);
        aereopuerto.setVisibility(View.VISIBLE);
        tv_aereopuerto.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);
        hjuriquilla.setVisibility(View.GONE);
        btn_juriquilla.setVisibility(View.GONE);
    }

    public void imgAereopuerto(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        btn_aereopuerto = findViewById(R.id.btn_aereopuerto);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        haereopuerto = findViewById(R.id.h_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.GONE);
        tv_juriquilla.setVisibility(View.GONE);
        bicentenario.setVisibility(View.GONE);
        tv_bicentenario.setVisibility(View.GONE);
        aereopuerto.setVisibility(View.GONE);
        tv_aereopuerto.setVisibility(View.GONE);
        menu.setVisibility(View.GONE);
        haereopuerto.setVisibility(View.VISIBLE);
        btn_aereopuerto.setVisibility(View.VISIBLE);
    }

    public void aereopuerto(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        btn_aereopuerto = findViewById(R.id.btn_aereopuerto);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        haereopuerto = findViewById(R.id.h_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.VISIBLE);
        tv_juriquilla.setVisibility(View.VISIBLE);
        bicentenario.setVisibility(View.VISIBLE);
        tv_bicentenario.setVisibility(View.VISIBLE);
        aereopuerto.setVisibility(View.VISIBLE);
        tv_aereopuerto.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);
        haereopuerto.setVisibility(View.GONE);
        btn_aereopuerto.setVisibility(View.GONE);
    }

    public void imgBicentenario(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        hbicentenario = findViewById(R.id.h_bicentenario);
        btn_bicentenario = findViewById(R.id.btn_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.GONE);
        tv_juriquilla.setVisibility(View.GONE);
        bicentenario.setVisibility(View.GONE);
        tv_bicentenario.setVisibility(View.GONE);
        aereopuerto.setVisibility(View.GONE);
        tv_aereopuerto.setVisibility(View.GONE);
        menu.setVisibility(View.GONE);
        hbicentenario.setVisibility(View.VISIBLE);
        btn_bicentenario.setVisibility(View.VISIBLE);
    }

    public void bicentenario(View view){
        juriquilla = findViewById(R.id.iv_juriquilla);
        tv_juriquilla = findViewById(R.id.txtv_juriqulla);
        aereopuerto = findViewById(R.id.iv_aereopuerto);
        tv_aereopuerto = findViewById(R.id.txtv_aereopuerto);
        bicentenario = findViewById(R.id.iv_bicentenario);
        hbicentenario = findViewById(R.id.h_bicentenario);
        btn_bicentenario = findViewById(R.id.btn_bicentenario);
        tv_bicentenario = findViewById(R.id.txtv_bicentenario);


        juriquilla.setVisibility(View.VISIBLE);
        tv_juriquilla.setVisibility(View.VISIBLE);
        bicentenario.setVisibility(View.VISIBLE);
        tv_bicentenario.setVisibility(View.VISIBLE);
        aereopuerto.setVisibility(View.VISIBLE);
        tv_aereopuerto.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);
        hbicentenario.setVisibility(View.GONE);
        btn_bicentenario.setVisibility(View.GONE);
    }


}
