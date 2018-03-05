package com.example.xiao.studykotlin.day01_Singleton

/**
 * Created by gitxi on 2018/1/10.
 */
class LazySynchronizedSingleton private constructor(){
    companion object {

        private var INSTANT :LazySynchronizedSingleton?=null

        @Synchronized
        fun getInstant() :LazySynchronizedSingleton{
            if (INSTANT ==null){
                INSTANT = LazySynchronizedSingleton()
            }
            return INSTANT!!
        }
    }
}