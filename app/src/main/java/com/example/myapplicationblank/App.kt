package com.example.myapplicationblank

import android.app.Application
import com.example.myapplicationblank.koinSample.myPresenterModule
import com.example.myapplicationblank.koinSample.myScopeModule
import com.example.myapplicationblank.koinSample.viewModelProfileViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
//https://medium.com/koin-developers/ready-for-koin-2-0-2722ab59cac3
class App : Application() {

    override fun onCreate() {
        super.onCreate()
//        startKoin(this, listOf(networkModule, viewModelModule, prefModule, helloModule))

        // start Koin context
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(listOf(networkModule, viewModelModule, prefModule, helloModule,myPresenterModule,viewModelProfileViewModelModule,myScopeModule))
        }



    }

}