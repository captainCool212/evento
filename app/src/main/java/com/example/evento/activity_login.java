package com.example.evento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        Button login;
        login = findViewById( R.id.loginButton );
        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent intent = new Intent(activity_login.this , MainActivity.class);
                startActivity( intent );
                finish();
            }
        } );
        TextView jump_register;
        jump_register = findViewById(R.id.jump_register );
        jump_register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent intent = new Intent(activity_login.this , activity_register.class);
                startActivity( intent );
                finish();
            }
        } );
    }
}