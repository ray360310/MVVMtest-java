package com.rayhung.mvvmtest_java.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.rayhung.mvvmtest_java.Model.ReservoirDataModel;

public class ReservoirViewModelFactory implements ViewModelProvider.Factory {

    private ReservoirDataModel mReservoirDataModel;

    public ReservoirViewModelFactory() {
        this.mReservoirDataModel = new ReservoirDataModel();
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ReservoirViewModel.class)) {
            return (T) new ReservoirViewModel(mReservoirDataModel);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
