package com.rayhung.mvvmtest_java.Internet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetStatus {

    private static final String TAG = InternetStatus.class.getSimpleName();

    private static InternetStatus mInternetStatus;

    public static InternetStatus mInstance(){
        if (mInternetStatus == null) {
            mInternetStatus = new InternetStatus();
        }
        return mInternetStatus;
    }

    public boolean checkInternetStatus(Context mContext){
        ConnectivityManager mConnectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
        //如果未連線的話，mNetworkInfo會等於null
        if(mNetworkInfo != null)
        {
            return true;
        }else{
            return false;
        }
    }
}
