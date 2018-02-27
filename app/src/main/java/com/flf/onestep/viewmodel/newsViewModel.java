package com.flf.onestep.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;


import com.flf.http.ApiServiceManager;
import com.flf.storage.TopNews;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by fenglingfeng on 2018/2/27.
 * 说明：处理主页新闻数据请求和解析.
 * model中的具体的网络请求交给repository去处理，这里直接调用repository中的方法即可
 */

public class newsViewModel<T> extends AndroidViewModel {


    public newsViewModel(@NonNull Application application) {
        super(application);
    }

    /**
     * 说明：网络请求娱乐新闻数据.
     */
    public void getNewsHead() {


    }

}
