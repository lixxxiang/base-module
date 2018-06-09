package com.emall.base.presenter.view

/**
 * Created by 刘晓 on 2018/6/6.
 */
interface BaseView{
    fun showLoading()
    fun hideLoading()
    fun onError(text: String)
}