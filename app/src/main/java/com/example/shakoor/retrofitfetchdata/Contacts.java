package com.example.shakoor.retrofitfetchdata;

import com.google.gson.annotations.SerializedName;

public class Contacts {


    @SerializedName("name")
    private  String Name;
    @SerializedName("email")
    private  String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

}
