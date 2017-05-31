package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by Eddie on 2017/5/28.
 */
public interface ICategoryService {

    public ServerResponse addCategory(String categoryName, Integer parentId);
    public ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    public ServerResponse<List<Category>> getChildrenParallel(Integer categoryId);
    public ServerResponse<List<Integer>> selectCategoryAndChildrenId(Integer categoryId);

}
