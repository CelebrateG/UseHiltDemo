package com.gq.locattionchangeapp.network;


import com.gq.locattionchangeapp.data.Truck;

import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


/**
 * @Auther:gq
 * @Desc:
 * @Date:2019/4/17
 */
public interface Api {
    String POST_PATH = "/coffeeapi/coffee/api";

    /**
     * 获取所有商品信息
     *
     * @param cmd
     * @param vmc_no
     * @return
     */
    @FormUrlEncoded
    @POST(POST_PATH)
    Callback<Truck> getProducts(@Field("cmd") String cmd, @Field("vmc_no") String vmc_no);


    /**
     * 获取并更新货道商品信息
     *
     * @return
     */
    @FormUrlEncoded
    @POST(POST_PATH)
    Callback<Truck> getProductsAndUpdate(@Field("cmd") String cmd, @Field("vmc_no") String vmc_no);


}
