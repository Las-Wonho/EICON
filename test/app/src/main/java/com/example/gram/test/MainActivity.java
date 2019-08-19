package com.example.gram.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.login);
        Button register = findViewById(R.id.register);
        
        login.setOnClickListener((e) -> {
            startActivity(new Intent(this, fmain.class));
        });
        register.setOnClickListener((e) -> {
            startActivity(new Intent(this, register.class));
        });
    }
}
