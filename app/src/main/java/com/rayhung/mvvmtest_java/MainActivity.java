package com.rayhung.mvvmtest_java;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.rayhung.mvvmtest_java.Adapter.ReservoirRvAdapter;
import com.rayhung.mvvmtest_java.POJO.ReservoirDataPOJO;
import com.rayhung.mvvmtest_java.ViewModel.ReservoirViewModel;
import com.rayhung.mvvmtest_java.ViewModel.ReservoirViewModelFactory;
import com.rayhung.mvvmtest_java.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    private ReservoirViewModelFactory mReservoirViewModelFactory = new ReservoirViewModelFactory();

    private ReservoirViewModel mReservoirViewModel;

    private ReservoirRvAdapter mReservoirRvAdapter = new ReservoirRvAdapter(new ArrayList<ReservoirDataPOJO>());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mReservoirViewModel = ViewModelProviders
                .of(this,mReservoirViewModelFactory)
                .get(ReservoirViewModel.class);

        mBinding.activityMainReservoirRecycleview.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        );
        mBinding.activityMainReservoirRecycleview.setAdapter(mReservoirRvAdapter);
        mBinding.setViewModel(mReservoirViewModel);
        mReservoirViewModel.getreservoirDatas().observe(this, new Observer<List<ReservoirDataPOJO>>() {
            @Override
            public void onChanged(@Nullable List<ReservoirDataPOJO> reservoirDataPOJOS) {
                mReservoirRvAdapter.swapDataList(reservoirDataPOJOS);
                mReservoirRvAdapter.notifyDataSetChanged();
            }
        });
        getData();
    }

    private void getData(){
        mReservoirViewModel.getreservoirData();
    }

}
