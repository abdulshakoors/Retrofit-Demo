package com.example.shakoor.retrofitfetchdata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("readContacts.php")
    Call<List<Contacts>> getContacts();


}
