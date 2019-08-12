package com.uts.reza.Activities;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.uts.reza.R;

// Tanggal Pengerjaan : 23 Mei 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuContact extends Fragment {


    public MenuContact() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_contact, container, false);
        ImageButton telpon = (ImageButton) view.findViewById(R.id.imageButton);
        ImageButton email = (ImageButton) view.findViewById(R.id.imageButton2);
        ImageButton instagram = (ImageButton) view.findViewById(R.id.imageView3);
        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = "081770239180" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://instagram.com/mrezafe" ;
                Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
                bukabrowser.setData(Uri. parse(url));
                startActivity(bukabrowser);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "mailto:febrianareza03@gmail.com" ;
                Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
                bukabrowser.setData(Uri. parse(url));
                startActivity(bukabrowser);
            }
        });
        return view;

    }

}

