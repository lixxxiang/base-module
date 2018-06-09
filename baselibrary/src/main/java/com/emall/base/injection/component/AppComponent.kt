package com.emall.base.injection.component

import android.content.Context
import com.emall.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun context(): Context
}
