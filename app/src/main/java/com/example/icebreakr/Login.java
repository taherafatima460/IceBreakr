package com.example.icebreakr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameET= findViewById(R.id.usernameET);
        final EditText passwordET= findViewById(R.id.passwordET);
        final TextView signupBtn= findViewById(R.id.signUpBtn);

        signupBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Login.this, Register.class));
            }
        });

    }
}
