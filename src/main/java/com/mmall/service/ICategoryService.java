package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by Eddie on 2017/5/28.
 */
public interface ICategoryService {

    public ServerResponse addCategory(String categoryName, Integer parentId);
    public ServerResponse updateCategoryName(Integer categoryId,String categoryName);

}
