package com.flf.http;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by fenglingfeng on 2018/2/27.
 */
public abstract class ApiCallback<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }

    //public abstract void result(ApiResponse<T> apiResponse);
}
