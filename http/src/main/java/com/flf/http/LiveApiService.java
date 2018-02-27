package com.flf.http;


import java.util.ArrayList;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by fenglingfeng on 2018/2/27.
 */

class LiveApiService {

    int LIMIT = 20;

    //请求获取不同游戏的直播列表
    //@GET("api/live/list/")
    /*Call<LiveBaseBean<ArrayList<ResponseModel>>> getLiveList(
            @Query("offset") int offset,
            @Query("limit") int limit,
            @Query("live_type") String live_type,
            @Query("game_type") String game_type
    );*/

 /*   //请求获取直播详情
    @GET("api/live/detail/")
    Flowable<LiveBaseBean<LiveDetailBean>> getLiveDetail(
            @Query("live_type") String live_type,
            @Query("live_id") String live_id,
            @Query("game_type") String game_type
    );

    //请求获取弹幕聊天室详情
    @GET("ajax_chatinfo")
    Flowable<LivebarrageBean> getPandaChatroom(
            @Query("roomid") String roomid
    );*/
}
