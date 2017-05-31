package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by Eddie on 2017/5/31.
 */
public interface IOrderService {

    public ServerResponse pay(Long orderNo, Integer userId, String path);
    public ServerResponse alipayCallback(Map<String,String> params);
    public ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
}
