package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by Eddie on 2017/5/27.
 */
public class Const {
    public static  final String CURRENT_USER="current_user";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Cart{
        Integer CHECKED=1;  //购物车选中状态
        Integer UN_CHECKED=0;   //购物车未选中状态

        String LIMIT_NUM_FAIL="LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS="LIMIT_NUM_SUCCESS";
    }

    public interface ProductOrderBy{
        Set<String> PRICE_ASC_DESC= Sets.newHashSet("price_desc","price_asc");
    }

    public interface Role{
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }


    public enum ProductStatusEnum{
        ON_SALE(1,"在线");
        private String value;
        private int code;
        ProductStatusEnum(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }

}
