package com.oji.ajinurlaksono_1202150032_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    String lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "AJI_1202150032", Toast.LENGTH_LONG);
        toast.show();
    }

    public void dineIn(View view) {

        this.lanjut = "Dinner In";

    }

    public void takeAway(View view) {
        this.lanjut = "Take Away";

    }

    public void pilih(View view) {
        if(this.lanjut == "Dinner In"){
            Intent i = new Intent(this, DinnerIn.class);
            startActivity(i);

        }else if(this.lanjut == "Take Away"){
            Intent i = new Intent(this, TakeAway.class);
            startActivity(i);
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Masukkan Data yang Benar", Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
