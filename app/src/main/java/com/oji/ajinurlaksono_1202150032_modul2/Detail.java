package com.oji.ajinurlaksono_1202150032_modul2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();
        int gambar = i.getExtras().getInt("gambar");     // get attribute yang di oper dari activity sebelumnya
        String nama = i.getStringExtra("nama");
        String harga = i.getStringExtra("harga");
        int komposisis = i.getExtras().getInt("komposisi");
        ImageView gambarDetail = (ImageView) findViewById(R.id.detailGambar);
        TextView namaMenu = (TextView) findViewById(R.id.namaMenu);
        TextView hargaMenu = (TextView) findViewById(R.id.hargaMenu);
        TextView komposisi = (TextView) findViewById(R.id.komposisi);


        gambarDetail.setImageResource(gambar);
        namaMenu.setText(nama);                             // set attribute ke textView
        hargaMenu.setText(harga);
        komposisi.setText(komposisis);
    }

    public void konfirmasi(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Pemesanan Berhasil, Harap tunggu sebentar");         //menggunakan pemanis untuk pesanan berhasil
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
