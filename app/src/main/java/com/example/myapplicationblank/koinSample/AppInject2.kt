package com.example.myapplicationblank.koinSample

import MyPresenter
import NetWorkCall
import Presenter
import Repository
import Utils
import com.example.myapplicationblank.fragment.DetailsFragment
import com.example.myapplicationblank.fragment.ProfileViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

//val myPresenterModule = module {
//    single { Repository() }
//}

//https://github.com/InsertKoinIO/getting-started-koin-android reference

val myPresenterModule = module {
    single { Repository() }
    single { NetWorkCall() }

    // factory<Presenter> { MyPresenter (get()) }

    // factory<Presenter> {  MyPresenter(get()) } //implementing these type throughing error

    factory { MyPresenter(get()) } //working fine with these

    // single will act like singleton class and factory will act like create multiple object everytime whenever it call

}


val viewModelProfileViewModelModule = module {

    viewModel {
        ProfileViewModel(get(), get())
    }
}



val myScopeModule = module {

    scope(named<DetailsFragment>()) {
        // scoped MyScopePresenter instance
        scoped { Utils() }
    }

}


