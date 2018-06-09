package com.emall.usercenter.presenter

import com.emall.base.ext.execute
import com.emall.base.presenter.BasePresenter
import com.emall.base.rx.BaseObserver
import com.emall.usercenter.presenter.view.RegisterView
import com.emall.usercenter.service.UserService
import com.emall.usercenter.service.impl.UserServiceImpl
import com.orhanobut.logger.Logger
import javax.inject.Inject

/**
 * Created by 刘晓 on 2018/6/6.
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    fun test() {
//        val userService = UserServiceImpl()
        userService.testService()
                .execute(object : BaseObserver<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onTestResult()
                    }
                }, lifecycleProvider)
    }

    fun register(telephone: String, userName: String, userPassword: String) {

        userService.register(telephone, userName, userPassword).execute(object : BaseObserver<Boolean>() {
            override fun onNext(t: Boolean) {
                if (t)
                    mView.onRegisterResult("注册成功")
            }
        }, lifecycleProvider)
    }
}


