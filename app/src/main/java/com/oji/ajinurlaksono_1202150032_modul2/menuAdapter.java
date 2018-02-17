package com.oji.ajinurlaksono_1202150032_modul2;

/**
 * Created by OJI on 16/02/2018.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
 public class menuAdapter extends RecyclerView.Adapter<menuAdapter.MyViewHolder> {
     private LayoutInflater mInflater;
    private List<menu> menuList;


     public menuAdapter(Context context, List<menu> menuList) {
         mInflater = LayoutInflater.from(context);
         this.menuList = menuList;

     }

     public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
         public TextView nama, harga;
         ImageView gambar;

         public MyViewHolder(View view) {
             super(view);

             nama = (TextView) view.findViewById(R.id.nama);
             harga = (TextView) view.findViewById(R.id.harga);
             gambar = (ImageView) view.findViewById(R.id.gambar);
             view.setOnClickListener(this);
         }


         @Override
         public void onClick(View view) {
             int mPosition = getLayoutPosition();
// Use that to access the affected item in mWordList.
             String element = menuList.get(mPosition).toString();
             Toast.makeText(view.getContext(), nama.getText(), Toast.LENGTH_SHORT).show();
             Intent i = new Intent(view.getContext(), Detail.class);
             int gambar = menuList.get(mPosition).getGambar();
             int komposisi = menuList.get(mPosition).getKomposisi();
             i.putExtra("gambar", gambar);
             i.putExtra("nama",nama.getText());
             i.putExtra("harga",harga.getText());
             i.putExtra("komposisi",komposisi);
             view.getContext().startActivity(i);

         }
     }


     @Override
     public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View mItemView = mInflater.inflate(R.layout.manu_list, parent, false);

         return new MyViewHolder(mItemView);
     }

     @Override
     public void onBindViewHolder(MyViewHolder holder, int position) {

         menu menu = menuList.get(position);
         holder.gambar.setImageResource(menu.getGambar());

         holder.harga.setText(menu.getHarga());
         holder.nama.setText(menu.getNama());


     }

     @Override
     public int getItemCount() {
         return menuList.size();
     }



}
