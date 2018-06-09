package com.emall.usercenter.presenter.injection.component

import com.emall.base.injection.PerComponentScope
import com.emall.base.injection.component.ActivityComponent
import com.emall.usercenter.presenter.injection.module.UserModule
import com.emall.usercenter.ui.activity.RegisterActivity
import dagger.Component

@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity:RegisterActivity)
}