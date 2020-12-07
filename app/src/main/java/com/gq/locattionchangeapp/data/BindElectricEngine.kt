package com.gq.locattionchangeapp.data

import javax.inject.Qualifier

//AnnotationRetention.BINARY 在编译之后会得到保留，但是无法通过反射去访问这个注解
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindElectricEngine
