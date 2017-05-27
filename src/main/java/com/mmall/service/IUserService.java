package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Eddie on 2017/5/27.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    public ServerResponse<String> register(User user);

    public ServerResponse<String> checkValid(String str,String type);
}
