package com.emall.usercenter.service.impl

import com.emall.base.data.protocol.BaseResp
import com.emall.base.rx.BaseException
import com.emall.usercenter.presenter.data.repository.UserRepository
import com.emall.usercenter.service.UserService
import com.orhanobut.logger.Logger
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {
    @Inject
    lateinit var repository: UserRepository

    override fun register(telephone: String, userName: String, userPassword: String): Observable<Boolean> {
        Logger.d(telephone + userName + userPassword)
        return repository.register(telephone, userName, userPassword)
                .flatMap(Function<BaseResp<String>, ObservableSource<Boolean>> { t ->
                    if (t.status != 0) {
                        return@Function Observable.error(BaseException(t.status, t.message))
                    }
                    Observable.just(true)
                })
    }

    override fun testService(): Observable<Boolean> {
        return Observable.just(true)
    }

}