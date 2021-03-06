package com.mmall.util;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by Eddie on 2017/5/30.
 */
public class DateTimeUtil {

    //joda-time

    //str>Date
    //Date>str
    public static String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(formatStr);
        DateTime dateTime=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date,String formatStr){
        if(date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date){
        if(date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static void main(String arg[]){
        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:11:11","yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy年MM月dd日HH时mm分"));
    }
}
