package com.mall.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Eddie on 2017/5/31.
 */
public class BigDecimalTest {

    @Test
    public void test01(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }

    @Test
    public void test02(){
        BigDecimal b1=new BigDecimal(0.05);
        BigDecimal b2=new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }


    @Test
    public void test03(){
        //必须使用String的构造器
        BigDecimal b1=new BigDecimal("0.05");
        BigDecimal b2=new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }


}
