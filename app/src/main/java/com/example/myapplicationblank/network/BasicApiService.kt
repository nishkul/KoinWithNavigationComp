package com.example.myapplicationblank.network



import com.example.myapplicationblank.model.Users
import io.reactivex.Single
import retrofit2.http.GET
interface BasicApiService {

    @GET("users")
    fun getAllUsers() : Single<List<Users>>
}