package com.emall.usercenter.ui.activity

import android.os.Bundle
import com.emall.base.ui.activity.BaseMvpActivity

import com.emall.usercenter.R
import com.emall.usercenter.presenter.RegisterPresenter
import com.emall.usercenter.presenter.injection.component.DaggerUserComponent
import com.emall.usercenter.presenter.injection.module.UserModule
import com.emall.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.Logger.addLogAdapter



class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView  {
    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(mActivityComponent).userModule(UserModule()).build().inject(this)
        mPresenter.mView = this
    }

    override fun onRegisterResult(res: String) {
        toast(res)
    }

    override fun onTestResult() {
        println("ddd")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Logger.addLogAdapter(AndroidLogAdapter())
//        mPresenter = RegisterPresenter()
        btn.setOnClickListener{
//            mPresenter.test()
            mPresenter.register("13331749289","1333","5a84b6430ed957bb8a115f515fe1c67f")
        }
    }
}
