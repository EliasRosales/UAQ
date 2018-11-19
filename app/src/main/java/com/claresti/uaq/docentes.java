package com.claresti.uaq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class docentes extends AppCompatActivity {

    FloatingActionMenu menu;
    TextView textView;

    Button btncalendario, btncalendarioCerrar;
    LayoutInflater layoutInflater;
    View popupView;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docentes);

        textView= findViewById(R.id.titulo);
        textView.setText("Portal Docentes");

        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);

        WebView myWebView = findViewById(R.id.portal_docentes);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://comunidad2.uaq.mx/portal/index.jsp?u=d");

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

    public void Facultades(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    public void TUAQ(View view){
        Intent i = new Intent(docentes.this, tUAQ.class);
        startActivity(i);
    }

    public void Contacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView mWebView;
        mWebView = findViewById(R.id.portal_docentes);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mWebView.canGoBack()) {
                        mWebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    public void uaq(View view){
        Uri uri = Uri.parse("http://www.uaq.mx");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
