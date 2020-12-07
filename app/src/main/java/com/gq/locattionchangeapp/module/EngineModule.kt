package com.gq.locattionchangeapp.module

import com.gq.locattionchangeapp.data.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

//负责提供依赖注入实例的模块
//@Module 注解的类，需要使用 @Installin 注解来指定 module 的范围
@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    //用于给 Engine 类型的接口提供实例,此处通过注解 BindGasEngine ，提供 gasEngine 实例
    @BindGasEngine
    @Binds
    abstract fun bindEngine(gasEngine: GasEngine): Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(electricEngine: ElectricEngine): Engine

}