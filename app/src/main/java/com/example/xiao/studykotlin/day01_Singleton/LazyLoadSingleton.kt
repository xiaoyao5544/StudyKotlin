package com.example.xiao.studykotlin.day01_Singleton

/**
 * Created by gitxi on 2018/1/10.
 */
class LazyLoadSingleton private constructor(){

    //原生写法
    companion object {
        val INSTANT_1 by lazy(LazyThreadSafetyMode.NONE) {
            LazyLoadSingleton();
        }
    }

    //java写法
    private var INSTANT_2 : LazyLoadSingleton? =null

    fun getInstance():LazyLoadSingleton{
        if (INSTANT_2==null){
            INSTANT_2 = LazyLoadSingleton();
        }
        return INSTANT_2!!
    }


}