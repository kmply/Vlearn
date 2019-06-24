package com.example.vlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public static final String AGE;

    static {
        AGE = "sdz.Login.intent.example.AGE";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        TimerTask tTimer = new TimerTask() {
            @Override
            public void run() {
                Intent login = new Intent(MainActivity.this, Login.class);
                login.putExtra(AGE, 31);
                startActivity(login);
            }
        }

    }

    public void passe(){

    }
}
