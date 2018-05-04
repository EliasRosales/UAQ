package com.claresti.uaq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class radioUAQ extends AppCompatActivity {

    FloatingActionMenu menu;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_uaq);

        menu = findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);

        WebView myWebView = findViewById(R.id.radio_uaq);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://radio.uaq.mx/");
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

    public void Facultades(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    public void Contacto(View view){
        Toast.makeText(this,"Esta ventana se encontrara proximamnete!! ;)", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView mWebView;
        mWebView = findViewById(R.id.radio_uaq);
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

}
