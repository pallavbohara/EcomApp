package com.hitesh_sahu.retailapp.web;

import com.hitesh_sahu.retailapp.model.SliderDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EComService {
    @GET("web_app_api.php?for=slider")
    Call<SliderDetails> listSliderImages();


}