package com.runingsong.qiubai.entity;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Administrator on 15-12-29.
 */
public interface QysService {
    @GET("article/list/{type}")
    Call<Response> getList(@Path("type") String type,@Query("page") int page);
}
