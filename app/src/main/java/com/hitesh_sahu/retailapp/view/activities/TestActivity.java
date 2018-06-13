package com.hitesh_sahu.retailapp.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hitesh_sahu.retailapp.R;
import com.hitesh_sahu.retailapp.model.SliderDetails;
import com.hitesh_sahu.retailapp.web.EComService;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestActivity extends AppCompatActivity {

    String TAG = "TestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://kcteam.in/justDo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EComService service = retrofit.create(EComService.class);

        Call<SliderDetails> repos = service.listSliderImages();
        try {
            Response<SliderDetails> response =  repos.execute();
            Log.d(TAG,response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
