package com.uts.reza.Presenter;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

import com.uts.reza.Model.RegisterModel;
import com.uts.reza.view.RegisterView;

public class RegisterPresenterClass implements RegisterPresenter{
    RegisterView view;
    RegisterModel model;

    public RegisterPresenterClass(RegisterView view) {
        this.view = view;
        this.model = new RegisterModel(this);
    }

    @Override
    public void onHandleRegister(String username, String password) {
        model.validate(username,password);
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

