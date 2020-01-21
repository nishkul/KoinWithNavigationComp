package com.example.myapplicationblank.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplicationblank.network.BasicApiService
import com.example.myapplicationblank.rxjava.RxSingleSchedulers
import com.example.myapplicationblank.model.Users
import io.reactivex.schedulers.Schedulers

class MainViewModel(val apiService: BasicApiService, val schedulers: RxSingleSchedulers) :
    ViewModel() {

    val userList = MutableLiveData<List<Users>>()
    fun fetchUsers() {
        apiService.getAllUsers().subscribeOn(Schedulers.io())
            .compose(schedulers.applySchedulers())
            .subscribe({ result ->
                userList.postValue(result)
                Log.v("ddddddddddd result", result.toString())
            },
                { throwable ->

                })

    }

}