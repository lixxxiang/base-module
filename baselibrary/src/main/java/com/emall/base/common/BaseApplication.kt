package com.emall.base.common

import android.app.Application
import com.emall.base.injection.component.AppComponent
import com.emall.base.injection.component.DaggerAppComponent
import com.emall.base.injection.module.AppModule

open class BaseApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}