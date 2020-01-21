package com.example.myapplicationblank.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplicationblank.AppPreferences
import com.example.myapplicationblank.HelloService
import com.example.myapplicationblank.R
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {
    val mainViewModel: MainViewModel by viewModel()
    private val preferences: AppPreferences by inject()
    private val helloModile: HelloService by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("rrrrrrrrrr", helloModile.hello())

        mainViewModel.userList.observe(this, Observer {

            it?.let {
                //                userAdapter.setItems(it)
                Log.v("ssssssss ", it.toString())
            }
            preferences.storeShouldShow(true)
        })

        mainViewModel.fetchUsers()

    }

    override fun onResume() {
        super.onResume()
        Log.v("prefereeee ", preferences.getShouldShow().toString())
    }
}
