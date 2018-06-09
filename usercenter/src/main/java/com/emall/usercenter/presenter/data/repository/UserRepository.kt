package com.emall.usercenter.presenter.data.repository

import com.emall.base.data.net.RetrofitFactory
import com.emall.base.data.protocol.BaseResp
import com.emall.usercenter.presenter.data.api.UserApi
import io.reactivex.Observable
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun register(telephone: String, userName: String, userPassword: String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(telephone, userName, userPassword)
    }
}