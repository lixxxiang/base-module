package com.emall.base.ui.activity

import android.os.Bundle
import com.emall.base.common.BaseApplication
import com.emall.base.injection.component.ActivityComponent
import com.emall.base.injection.component.DaggerActivityComponent
import com.emall.base.injection.module.ActivityModule
import com.emall.base.injection.module.LifecycleProviderModule
import com.emall.base.presenter.BasePresenter
import com.emall.base.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by 刘晓 on 2018/6/6.
 */
open abstract class BaseMvpActivity<T: BasePresenter<*>>:BaseActivity(), BaseView {
    lateinit var mActivityComponent: ActivityComponent

    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }

    @Inject
    lateinit var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()
    }

    abstract fun injectComponent()
    private fun initActivityInjection() {
        mActivityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

}