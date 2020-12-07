package com.gq.locattionchangeapp.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.*
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
//InstallIn 内置组件，此处对应 Activity 组件，共有 7 种 内置组件: ApplicationComponent,ActivityComponent,FragmentComponent,ViewComponent,
// ViewWithFragmentComponent,ActivityRetainedComponent(viewModel),ServiceComponent(Service)
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    //Hilt 默认会为每次的依赖注入行为都创建不同的实例，所以需要加 Singleton，此为 组件作用域，与 7 个内置组件分别一一对应：
    //Singleton,ActivityScoped,FragmentScoped,ViewScoped,ViewScoped,ActivityRetainedScoped,ServiceScoped
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://zongs365.com")
            .client(okHttpClient)
            .build()
    }

}