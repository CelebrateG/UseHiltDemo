package com.gq.locattionchangeapp.data

import javax.inject.Inject

//通过该构造函数提供实例
class Truck @Inject constructor(val driver: Driver) {

    //给接口进行依赖注入
    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    fun deliver() {
        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo.")
        gasEngine.shoutDown()
        electricEngine.shoutDown()
    }
}