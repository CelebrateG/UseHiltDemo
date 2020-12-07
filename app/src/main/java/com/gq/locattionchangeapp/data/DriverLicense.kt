package com.gq.locattionchangeapp.data

import android.app.Activity
import com.gq.locattionchangeapp.MyApplication
import javax.inject.Inject

//Activity,Application 可自动注入,但是其子类型不可以,需要通过 module 提供
class DriverLicense @Inject constructor(val activity: Activity, val myApplication: MyApplication) {
}