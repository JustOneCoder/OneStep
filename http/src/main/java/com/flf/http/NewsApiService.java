package com.flf.http;


import com.flf.comm.Constants;
import com.flf.storage.TopNews;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fenglingfeng on 2018/2/27.
 * 新闻api
 * http://c.m.163.com/nc/article/list/T1348647909107/0-20.html
 * http://c.m.163.com/nc/article/1/full.html
 */

public interface NewsApiService {

    @GET("list/" + Constants.NETEASY_NEWS_HEADLINE + "/{index}-20.html")
    Call<TopNews> getTopNews(@Path("index") String index);


   /* @GET("list/" + Constants.NETEASY_NEWS_TEC + "/{index}-20.html")
    Observable<TecNewsList> getTecNews(@Path("index") String index);

    @GET("list/" + Constants.NETEASY_NEWS_SPORT + "/{index}-20.html")
    Observable<SportNewsList> getSportNews(@Path("index") String index);

    @GET("list/" + Constants.NETEASY_NEWS_HEALTH + "/{index}-20.html")
    Observable<HealthNewsList> getRecommendNews(@Path("index") String index);*/


    @GET("{id}/full.html")
    Call<ResponseBody> getNewsContent(@Path("id") String id);
}
