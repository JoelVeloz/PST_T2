package com.example.mediconline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Pantalla_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intento = new Intent(Pantalla_splash.this, MainActivity.class);
                startActivity(intento);
                finish();
            }
        }, 3000);
    }
}