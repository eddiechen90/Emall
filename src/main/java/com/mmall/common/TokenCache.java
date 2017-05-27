package com.mmall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.omg.IOP.ExceptionDetailMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Eddie on 2017/5/27.
 */
public class TokenCache {

    private static Logger logger= LoggerFactory.getLogger(TokenCache.class);
    public static final String TOKEN_PREFIX = "token_";

    //LRU算法
    private static LoadingCache<String,String> localCatch = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000)
            .build(new CacheLoader<String, String>() {
                //默认的数据加载实现，当调用get取值时，如果key没有对应的值，就调用这个方法进行加载。
                @Override
                public String load(String s) throws Exception {
                    return null;
                }
            });

    public static void setKey(String key,String value){
        localCatch.put(key,value);
    }

    public static String getKey(String key){
        String value=null;
        try{
            value=localCatch.get(key);
            if("null".equals(value)){
                return null;
            }
            return value;
        }catch (Exception e){
            logger.error("localCashe get error",e);
        }
        return null;
    }

}
