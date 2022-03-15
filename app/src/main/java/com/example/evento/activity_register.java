package com.example.evento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_register extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );
        Button register;
        getSupportActionBar().hide();
        register = findViewById( R.id.registerButton );
        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent intent = new Intent(activity_register.this , activity_login.class);
                startActivity( intent );
                Toast.makeText( getApplicationContext(),"REGISTRATION SUCCESSFULL" ,Toast.LENGTH_SHORT).show();
                finish();
            }
        } );
        TextView jump_login;
        jump_login = findViewById( R.id.jumpLogin );
        jump_login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent intent = new Intent(activity_register.this , activity_login.class);
                startActivity( intent );
                finish();
            }
        } );
    }
}