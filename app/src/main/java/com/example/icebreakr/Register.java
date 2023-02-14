package com.example.icebreakr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.icebreakr.ui.main.RegisterFragment;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText email = findViewById(R.id.emailET);
        final EditText password = findViewById(R.id.passwordET);
        final EditText confirmpassword = findViewById(R.id.confirmpasswordET);

        final AppCompatButton signUpBtn = findViewById(R.id.signUpBtn);
        final AppCompatButton signInBtn = findViewById(R.id.signInBtn);


    }
}