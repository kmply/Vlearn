package com.example.vlearn;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static com.example.vlearn.MainActivity.AGE;

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Intent i = getIntent();
        int age = i.getIntExtra(AGE, 0);

        if (age != 0){
            age = 2;
        }
    }
}
