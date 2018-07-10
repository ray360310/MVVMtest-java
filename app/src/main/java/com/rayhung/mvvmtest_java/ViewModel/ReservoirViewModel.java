package com.rayhung.mvvmtest_java.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;

import com.rayhung.mvvmtest_java.Model.ReservoirDataModel;
import com.rayhung.mvvmtest_java.POJO.ReservoirDataPOJO;

import java.util.List;

public class ReservoirViewModel extends ViewModel {

    public final ObservableBoolean isLoading = new ObservableBoolean(false);

    private final MutableLiveData<List<ReservoirDataPOJO>> reservoirData = new MutableLiveData<>();

    private ReservoirDataModel mreservoirDataModel;

    public ReservoirViewModel(ReservoirDataModel reservoirDataModel){
        super();
        this.mreservoirDataModel = reservoirDataModel;
    }

    LiveData<List<ReservoirDataPOJO>> getreservoirDatas(){
        return reservoirData;
    }

    public void getreservoirData(){
        isLoading.set(true);
        mreservoirDataModel.getData(new ReservoirDataModel.onDataReadyCallback() {
            @Override
            public void onDataReady(List<ReservoirDataPOJO> mListData) {
                reservoirData.setValue(mListData);
                isLoading.set(false);
            }
        });
    }

}
