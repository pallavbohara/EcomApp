package com.hitesh_sahu.retailapp.web;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebMethods {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://kcteam.in/justDo/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    EComService service = retrofit.create(EComService.class);


}
