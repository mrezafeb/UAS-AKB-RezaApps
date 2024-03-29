package com.uts.reza.Model;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

import android.text.TextUtils;

import com.uts.reza.Presenter.RegisterPresenter;

public class RegisterModel {
    RegisterPresenter presenter;

    public RegisterModel(RegisterPresenter presenter) {
        this.presenter = presenter;
    }

    public void validate(String username, String password) {

        if(TextUtils.isEmpty(username))
            presenter.onError("Please Enter Username !");
        else if(TextUtils.isEmpty(password))
            presenter.onError("Please Enter Password");
        else if(username.length()<4)
            presenter.onError("Username Must be at least 4 character long !");
        else if(password.length()<4)
            presenter.onError("Password Must be at least 4 character long !");
        else
            presenter.onSuccess();
    }
}
