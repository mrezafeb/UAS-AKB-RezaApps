package com.uts.reza.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.uts.reza.R;

// Tanggal Pengerjaan : 23 Mei 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private Button button;
    private int[] layouts = {R.layout.fragment_halaman1, R.layout.fragment_halaman2, R.layout.fragment_halaman3};
    private Adaptor mpagerAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdaptor = new Adaptor(layouts, this);
        pager.setAdapter(mpagerAdaptor);






    }
    public void next(View view){
        Intent in = new Intent(this,Login.class);
        startActivity(in);

    }




}

