package com.emall.usercenter.presenter.view

import com.emall.base.presenter.view.BaseView

/**
 * Created by 刘晓 on 2018/6/6.
 */
interface RegisterView : BaseView {
   fun onTestResult()
   fun onRegisterResult(res: String)
}