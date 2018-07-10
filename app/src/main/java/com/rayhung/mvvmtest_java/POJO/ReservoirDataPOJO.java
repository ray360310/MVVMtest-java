package com.rayhung.mvvmtest_java.POJO;

import com.google.gson.annotations.SerializedName;

/**
 *
 * Data Format
 * https://data.wra.gov.tw/WraStandardWrisp/Query/StandardDetail.aspx?DictID=107
 *
 * */

public class ReservoirDataPOJO {

    //出水量(合計)
    @SerializedName("OutflowTotal")
    public final double outflowTotal;

    //呆水位
    @SerializedName("DeadStorageLevel")
    public final double deadStorageLevel;

    //水庫編號
    @SerializedName("ReservoirIdentifier")
    public final int reservoirIdentifier;

    //水庫名稱
    @SerializedName("ReservoirName")
    public final String reservoirName;

    //滿水位
    @SerializedName("FullWaterLevel")
    public final double fullWaterLevel;

    //取用水量
    @SerializedName("Outflow")
    public final double outFlow;

    //集水區雨量
    @SerializedName("CatchmentAreaRainfall")
    public final double catchmentAreaRainfall;

    //紀錄時間
    @SerializedName("RecordTime")
    public final String recordTime;

    //有效容量
    @SerializedName("EffectiveCapacity")
    public final double effectiveCapacity;

    //進水量
    @SerializedName("InflowVolume")
    public final double inflowVolume;

    //放流量合計
    @SerializedName("CrossFlow")
    public final double crossFlow;

    //溢洪道流量
    @SerializedName("RegulatoryDischarge")
    public final double regulatoryDischarge;

    //排洪道流量
    @SerializedName("OutflowDischarge")
    public final double outflowDischarge;

    public ReservoirDataPOJO(double outflowTotal,
                             double deadStorageLevel,
                             int reservoirIdentifier,
                             String reservoirName,
                             double fullWaterLevel,
                             double outFlow,
                             double catchmentAreaRainfall,
                             String recordTime,
                             double effectiveCapacity,
                             double inflowVolume,
                             double crossFlow,
                             double regulatoryDischarge,
                             double outflowDischarge) {
        this.outflowTotal = outflowTotal;
        this.deadStorageLevel = deadStorageLevel;
        this.reservoirIdentifier = reservoirIdentifier;
        this.reservoirName = reservoirName;
        this.fullWaterLevel = fullWaterLevel;
        this.outFlow = outFlow;
        this.catchmentAreaRainfall = catchmentAreaRainfall;
        this.recordTime = recordTime;
        this.effectiveCapacity = effectiveCapacity;
        this.inflowVolume = inflowVolume;
        this.crossFlow = crossFlow;
        this.regulatoryDischarge = regulatoryDischarge;
        this.outflowDischarge = outflowDischarge;
    }
}
