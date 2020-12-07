package com.gq.locattionchangeapp.module

import android.app.Application
import com.gq.locattionchangeapp.MyApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class MyApplicationModule {

    //用于提供 MyApplication 实例
    @Provides
    fun provideMyApplication(application: Application): MyApplication {
        return application as MyApplication
    }


}