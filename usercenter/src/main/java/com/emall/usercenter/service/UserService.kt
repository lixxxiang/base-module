package com.emall.usercenter.service

import io.reactivex.Observable
import java.util.*

interface UserService {
    fun testService():Observable<Boolean>
    fun register(telephone: String, userName: String, userPassword: String):Observable<Boolean>
}