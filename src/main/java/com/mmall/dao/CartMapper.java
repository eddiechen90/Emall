package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    List<Cart> selectByUserId(@Param("userId")Integer userId);

    int selectCartProductCheckStatusByuserId(@Param("userId") Integer userId);

    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productList")List<String> productList);

    int checkedOrUncheckedProduct(@Param("userId") Integer userId,@Param("checked")Integer checked,@Param("productId") Integer productId);

    int selectCartProductCount(@Param("userId") Integer userID);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}