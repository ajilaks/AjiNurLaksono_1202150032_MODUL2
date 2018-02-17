package com.oji.ajinurlaksono_1202150032_modul2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContentMenu extends AppCompatActivity {

    private List<menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private menuAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new menuAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

    }

    private void prepareMovieData() {
        menu menu = new menu(R.drawable.capcay, "Capcay", "Rp. 12.000", R.string.capcay);
        menuList.add(menu);

        menu = new menu(R.drawable.nasgor, "Nasi Goreng", "Rp. 13.000", R.string.nasgor);
        menuList.add(menu);
        menu = new menu(R.drawable.nasimawut, "Nasi Mawut", "Rp. 14.000", R.string.nasimawut);
        menuList.add(menu);
        menu = new menu(R.drawable.miegoreng, "Mie Goreng", "Rp. 12.000", R.string.miegoreng);
        menuList.add(menu);



       // mAdapter.notifyDataSetChanged();
    }

}
