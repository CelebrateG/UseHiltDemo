package com.gq.locattionchangeapp.data

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
//ActivityContext 对应 ActivityScoped 组件作用域
@ActivityScoped
class Driver @Inject constructor(@ActivityContext val context: Context,val driverLicense: DriverLicense) {
}