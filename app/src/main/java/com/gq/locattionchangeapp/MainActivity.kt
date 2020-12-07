package com.gq.locattionchangeapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.gq.locattionchangeapp.data.Student
import com.gq.locattionchangeapp.data.Truck
import com.gq.locattionchangeapp.network.Api
import com.gq.locattionchangeapp.viewmodel.TruckViewModel
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

//入口点
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //注入
    @Inject
    lateinit var truck: Truck

    //注入
    @Inject
    lateinit var student: Student

    //使用 @ViewModelInject 注解，则常规写法获取即可
    val viewModel: TruckViewModel by lazy {
        ViewModelProvider(this).get(TruckViewModel::class.java)
    }

    //注入三方库
    @Inject
    lateinit var okHttpClient: OkHttpClient

    //注入三方库
    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v: View
        truck.deliver()

        student.name = "KanYe"
        println(student.name)
//        retrofit.create(Api::class.java).getProducts("", "")
    }

}