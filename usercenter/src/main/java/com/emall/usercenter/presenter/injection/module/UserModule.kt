package com.emall.usercenter.presenter.injection.module

import com.emall.usercenter.service.UserService
import com.emall.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

@Module
class UserModule {
    @Provides
    fun providesUserService(service: UserServiceImpl): UserService{
        return service
    }
}