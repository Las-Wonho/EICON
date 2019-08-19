package com.example.gram.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button sumit = findViewById(R.id.login_sumit);
        sumit.setOnClickListener((e) -> {
            // TODO: Check ID & Password
            Intent i = new Intent(this, fmain.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(i);
        });
    }
}
