package com.uts.reza.Activities;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.uts.reza.Presenter.RegisterPresenter;
import com.uts.reza.Presenter.RegisterPresenterClass;
import com.uts.reza.R;
import com.uts.reza.view.RegisterView;


public class Register extends AppCompatActivity implements RegisterView {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    EditText edtName, edtPassword;
    Button btnRegister;

    RegisterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        presenter = new RegisterPresenterClass(this);

        edtName = (EditText) findViewById(R.id.edtName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueName = edtName.getText().toString();
                String valuePassword = edtPassword.getText().toString();
                presenter.onHandleRegister(valueName,valuePassword);

            }
        });

    }

    @Override
    public void onSuccess() {
        String nama = edtName.getText().toString();
        String password = edtPassword.getText().toString();

        editor = sharedPreferences.edit();

        editor.putString("nameKey", nama);
        editor.putString("passwordKey", password);
        editor.commit();
        Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();

        Intent loginIntent = new Intent(Register.this, Login.class);
        startActivity(loginIntent);
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
