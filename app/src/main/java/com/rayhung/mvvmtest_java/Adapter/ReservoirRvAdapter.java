package com.rayhung.mvvmtest_java.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.rayhung.mvvmtest_java.POJO.ReservoirDataPOJO;
import com.rayhung.mvvmtest_java.databinding.RvReservoirItemBinding;

import java.util.List;


public class ReservoirRvAdapter extends RecyclerView.Adapter<ReservoirRvAdapter.ReservoirRvViewHolder>{

    private List<ReservoirDataPOJO> mDataList;

    public ReservoirRvAdapter (List<ReservoirDataPOJO> mDataList){
        this.mDataList = mDataList;
    }

    class ReservoirRvViewHolder extends RecyclerView.ViewHolder{

        private final RvReservoirItemBinding mBinding;

        ReservoirRvViewHolder(RvReservoirItemBinding binding){
            super(binding.getRoot());
            this.mBinding = binding;
        }

        void bind(ReservoirDataPOJO reservoirData){
            mBinding.setReservoirData(reservoirData);
            mBinding.executePendingBindings();
        }

    }

    @NonNull
    @Override
    public ReservoirRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mLayoutInflater = LayoutInflater.from(parent.getContext());
        RvReservoirItemBinding mBinding = RvReservoirItemBinding.inflate(mLayoutInflater,parent,false);
        return new ReservoirRvViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ReservoirRvViewHolder holder, int position) {
        ReservoirDataPOJO reservoirData = mDataList.get(position);
        holder.bind(reservoirData);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void swapDataList(List<ReservoirDataPOJO> newDataList) {
        this.mDataList.clear();
        this.mDataList.addAll(newDataList);
    }

}
