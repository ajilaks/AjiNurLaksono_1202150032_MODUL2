package com.oji.ajinurlaksono_1202150032_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DinnerIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int someVar;
    String pilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_in);
        showSpinner();
    }

    public void showSpinner(){
        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.sNoMejas);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);    //perkondisian untuk memunculkan spinner
        }

        // membuat ArrayAdapter untuk layout kita.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.menu, android.R.layout.simple_spinner_item);

        // memunculkan menu yang akan kita pilih
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // melakukan set adapter jika dipilih
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) { //method untuk memproses ketika item yang dipilih
    this.pilihan = adapterView.getItemAtPosition(i).toString();
    String showToast = this.pilihan+" Telah Terpesan";
    this.someVar = i;   //disni ketika array spinner yang dipilih adalah 0, maka tidak akan memunculkan toast, tapi begitupula sebaliknya
    if(i!=0) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
        toast.show();
    }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void mesan(View view) {
        Context context = getApplicationContext();

        if(someVar!=0) {
        Intent i = new Intent(this, ContentMenu.class); //ketika ada item yang dipilih selain 0, maka akan meproses ke activity berikutnya
        startActivity(i);}
        else {
            Toast toast = Toast.makeText(context, "Pilih Meja Dulu", Toast.LENGTH_LONG);
            toast.show();

        }
    }
}
