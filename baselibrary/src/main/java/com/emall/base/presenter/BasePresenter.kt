package com.emall.base.presenter

import com.emall.base.presenter.view.BaseView
import com.trello.rxlifecycle2.LifecycleProvider
import javax.inject.Inject

/**
 * Created by 刘晓 on 2018/6/6.
 */
open class BasePresenter<T: BaseView>{
    lateinit var mView:T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

}
















