package com.example.xiao.studykotlin.day01_Singleton

/**
 * Created by gitxi on 2018/1/10.
 */
class DoubleCheckSingleton private constructor(){

    companion object {
     val INSTANT_1 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
        DoubleCheckSingleton()
     }
    }


    private var INSTANT_2 :DoubleCheckSingleton?=null
    fun getInstance():DoubleCheckSingleton{
        if (INSTANT_2==null){

        }
        return INSTANT_2!!
    }
}