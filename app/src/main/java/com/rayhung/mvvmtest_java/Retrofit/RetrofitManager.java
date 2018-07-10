package com.rayhung.mvvmtest_java.Retrofit;

import com.rayhung.mvvmtest_java.Util.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static RetrofitManager mInstance = new RetrofitManager();

    private ReservoirService mReserviorService;

    private RetrofitManager(){
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(Config.apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mReserviorService = mRetrofit.create(ReservoirService.class);
    }

    public static ReservoirService getAPI(){
        return mInstance.mReserviorService;
    }

}
