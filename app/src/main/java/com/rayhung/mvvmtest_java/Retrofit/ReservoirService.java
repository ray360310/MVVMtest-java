package com.rayhung.mvvmtest_java.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ReservoirService {
    @GET("v4/DailyOperationalStatisticsOfReservoirs")
    Call<ReservoirResponse> getData();
}
