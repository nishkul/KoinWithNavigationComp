package com.example.myapplicationblank

import com.example.myapplicationblank.network.createBasicAuthService
import com.example.myapplicationblank.rxjava.RxSingleSchedulers
import com.example.myapplicationblank.ui.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { createBasicAuthService() }
    single { RxSingleSchedulers.DEFAULT }
}

val viewModelModule = module {

    viewModel {
        MainViewModel(get(), get())
    }
}


val prefModule = module {
    single { AppPreferences(androidContext()) }
}

val helloModule = module {

    single { HelloMessageData() }

    single { HelloServiceImpl(get()) as HelloService }
}

val helloModule2 = module {

    single { HelloMessageData() }

    factory<HelloService> { HelloServiceImpl(get()) }
}