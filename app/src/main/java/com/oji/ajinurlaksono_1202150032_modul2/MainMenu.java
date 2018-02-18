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
        Toast toast = Toast.makeText(context, "AJI_1202150032", Toast.LENGTH_LONG); //membuat toast
        toast.show();
    }

    public void dineIn(View view) {

        this.lanjut = "Dinner In";  //mengisi attribute ketika dinner in dipilih

    }

    public void takeAway(View view) {
        this.lanjut = "Take Away";  //mengisi attribute ketika take away dipilih

    }

    public void pilih(View view) {
        if(this.lanjut == "Dinner In"){
            Intent i = new Intent(this, DinnerIn.class); //ketika attribute lanjut dinner in, activity intent menuju ke dinner in class
            startActivity(i);

        }else if(this.lanjut == "Take Away"){
            Intent i = new Intent(this, TakeAway.class);    //ketika attribute lanjut take away, activity intent menuju ke take away class
            startActivity(i);
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Masukkan Data yang Benar", Toast.LENGTH_LONG);   //ketika tidak ada yg dipilih, maka hanya akan memunculkan toast
            toast.show();

        }

    }
}
