package com.gq.locattionchangeapp

/**
 * 通过字节码 Decompile 可以看出，
 * 这是一个 饿汉式 单例，在 static 代码块中完成了初始化，
 * 线程安全
 */
object Singleton {
    fun sayHello(){
        println("Singleton say hello")
    }
}