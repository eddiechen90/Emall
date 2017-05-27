package com.mmall.common;

/**
 * Created by Eddie on 2017/5/27.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    TLLEGAL_ARGUMENT(2,"TLLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
