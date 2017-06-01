package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Order;
import com.mmall.vo.OrderVo;

import java.util.List;
import java.util.Map;

/**
 * Created by Eddie on 2017/5/31.
 */
public interface IOrderService {

    public ServerResponse pay(Long orderNo, Integer userId, String path);
    public ServerResponse alipayCallback(Map<String,String> params);
    public ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
    public ServerResponse create(Integer userId,Integer shippingId );
    public ServerResponse<String> cancel(Integer userId,Long orderNo);
    public ServerResponse getOrderCartProduct(Integer userId);
    public ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);
    public ServerResponse<PageInfo> getOrderList(Integer userId,int pageNum,int pageSize);
    public ServerResponse<PageInfo> manageList(int pageNum,int pageSize);
    public ServerResponse<OrderVo> mangeDetail(Long orderNo);
    public ServerResponse<PageInfo> mangeSearch(Long orderNo,Integer pageNum,int pageSize);
    public ServerResponse<String> manageSendGoods(Long orderNo);
}
