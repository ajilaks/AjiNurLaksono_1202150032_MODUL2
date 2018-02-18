package com.oji.ajinurlaksono_1202150032_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //menggunakan thread untuk membuat splash screen
        new Handler().postDelayed(new Runnable() {
            @Override       //pada runnable ini terdapat 2 parameten, yaitu run activity nya dan delay dalam milli second
            public void run() {
                startActivity(new Intent(MainActivity.this,MainMenu.class));
                finish();
            }
        },2000); //delay selama 2 detik
    }
}
