package com.uts.reza.Model;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

import android.text.TextUtils;

import com.uts.reza.Presenter.LoginPresenter;

public class LoginModel {
    private LoginPresenter presenter;

    public LoginModel(LoginPresenter presenter){
        this.presenter=presenter;
    }

    public void validateUser(String username, String password , String dataUsername, String dataPassword) {

        if(TextUtils.isEmpty(username))
            presenter.onError("Please Enter Username !");
        else if(TextUtils.isEmpty(password))
            presenter.onError("Please Enter Password");
        else if(!dataUsername.equals(username))
            presenter.onError("Wrong Username !");
        else if(!dataPassword.equals(password))
            presenter.onError("Wrong Password !");
        else
            presenter.onSuccess();
    }

}
