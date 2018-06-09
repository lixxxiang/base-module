package com.emall.base.injection.module

import android.content.Context
import com.emall.base.common.BaseApplication
import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun provideLifecycleProvider(): LifecycleProvider<*> {
        return this.lifecycleProvider
    }
}

