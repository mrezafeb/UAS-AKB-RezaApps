package com.uts.reza.Presenter;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

import com.uts.reza.Model.LoginModel;
import com.uts.reza.view.LoginView;

public class LoginPresenterClass implements LoginPresenter {
    private LoginView view;
    private LoginModel model;

    public LoginPresenterClass(LoginView view){
        this.view=view;
        this.model=new LoginModel(this);
    }

    @Override
    public void onHandleLogin(String username, String password, String dataUsername, String dataPassword) {
        model.validateUser(username,password,dataUsername,dataPassword);
    }

    @Override
    public void onSuccess() {
        view.onSuccess();
    }

    @Override
    public void onError(String message) {
        view.onError(message);
    }
}

