package com.brosolved.pejus.kanta.models;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


@Generated("com.robohorse.robopojogenerator")
public class MutableUser {

    @SerializedName("data")
    private UserInfo data;

    public void setData(UserInfo data){
        this.data = data;
    }

    public UserInfo getData(){
        return data;
    }

    @Override
    public String toString(){
        return
                "User{" +
                        "data = '" + data + '\'' +
                        "}";
    }
}
