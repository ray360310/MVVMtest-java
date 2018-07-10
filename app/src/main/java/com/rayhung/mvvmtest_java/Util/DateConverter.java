package com.rayhung.mvvmtest_java.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    // yyyy-mm-dd to date
    public static Date formatStringToDate(String dateStr){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = format.parse(dateStr);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String formatDateToString(Date date) {
        String sDate;
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        sDate = sd.format(date);
        return sDate;
    }

}
