package com.emall.usercenter.presenter.data.api

import com.emall.base.data.protocol.BaseResp
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface UserApi {

    @POST("global/mall/register.do")
    @FormUrlEncoded
    fun register(@Field("telephone") p1: String,
                 @Field("userName") p2: String,
                 @Field("userPassword") p3: String): Observable<BaseResp<String>>
}