package com.example.evento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class activity_splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_screen );
        getSupportActionBar().hide();
        getWindow().addFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent intent = new Intent(activity_splash_screen.this,activity_login.class);
                    startActivity(intent);
                    finish();
                }

            }
        };td.start();

    }
}