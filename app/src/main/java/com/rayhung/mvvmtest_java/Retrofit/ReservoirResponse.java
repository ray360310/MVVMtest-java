package com.rayhung.mvvmtest_java.Retrofit;

import com.google.gson.annotations.SerializedName;
import com.rayhung.mvvmtest_java.POJO.ReservoirDataPOJO;

import java.util.List;

public class ReservoirResponse {

    @SerializedName("value")
    private List<ReservoirDataPOJO> reservoirDataList;

    public List<ReservoirDataPOJO> getReservoirDataList() {
        return reservoirDataList;
    }

    public void setReservoirDataList(List<ReservoirDataPOJO> reservoirDataList) {
        this.reservoirDataList = reservoirDataList;
    }
}
