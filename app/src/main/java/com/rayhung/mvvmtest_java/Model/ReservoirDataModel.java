package com.rayhung.mvvmtest_java.Model;

import com.rayhung.mvvmtest_java.POJO.ReservoirDataPOJO;
import com.rayhung.mvvmtest_java.Retrofit.ReservoirService;
import com.rayhung.mvvmtest_java.Retrofit.ReservoirResponse;
import com.rayhung.mvvmtest_java.Retrofit.RetrofitManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReservoirDataModel {

    private ReservoirService mreservoirService = RetrofitManager.getAPI();

    public void getData(final onDataReadyCallback callback){
        mreservoirService.getData()
                .enqueue(new Callback<ReservoirResponse>() {
                    @Override
                    public void onResponse(Call<ReservoirResponse> call, Response<ReservoirResponse> response) {
                        callback.onDataReady(response.body().getReservoirDataList());
                    }

                    @Override
                    public void onFailure(Call<ReservoirResponse> call, Throwable t) {

                    }
                });
    }

    public interface onDataReadyCallback{
        void onDataReady(List<ReservoirDataPOJO> mListData);
    }

}
