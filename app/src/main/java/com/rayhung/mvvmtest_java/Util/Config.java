package com.rayhung.mvvmtest_java.Util;

public class Config {

    public enum Env {
        PROD("https://tw.rter.info"),
        DEV("https://tw.rter.info");

        public final String host;
        Env(String host){
            this.host = host;
        }
    }

    public final static int VERSION = 1;

    public final static Env mEnv = Env.PROD;

    public static String getEndPoint()
    {
        return getEndPoint(Config.mEnv, VERSION);
    }

    public static String getEndPoint(Env mEnv, int version){
        return String.format("https://%s/api/v%d", mEnv.host,version);
    }

    /**
     *
     * 先用下面的...
     *
     * */

    public static final String apiUrl = "http://odata.wra.gov.tw/";

}
