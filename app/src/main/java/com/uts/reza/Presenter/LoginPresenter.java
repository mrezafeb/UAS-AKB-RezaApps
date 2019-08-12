package com.uts.reza.Presenter;

// Tanggal Pengerjaan : 12 Agustus 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7

public interface LoginPresenter {
    void onHandleLogin(String username, String password, String dataUsername, String dataPassword);
    void onSuccess();
    void onError(String message);
}
