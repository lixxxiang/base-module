package com.emall.android

import android.annotation.SuppressLint
import android.os.Bundle
import com.emall.base.TestActivity

class MainActivity : TestActivity() {

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
