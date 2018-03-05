package com.example.xiao.studykotlin.day01_Singleton

/**
 * Created by gitxi on 2018/1/11.
 */
class InnerStaticSingleton private constructor() {
    companion object {
        fun getInstent() = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = InnerStaticSingleton()
    }
}