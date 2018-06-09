package com.emall.base.injection.component

import android.app.Activity
import android.content.Context
import com.emall.base.injection.ActivityScope
import com.emall.base.injection.module.ActivityModule
import com.emall.base.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class,LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}