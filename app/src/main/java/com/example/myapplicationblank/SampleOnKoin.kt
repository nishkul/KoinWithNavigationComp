package com.example.myapplicationblank

/**
 * Hello Service - interface
 */
interface HelloService {
    fun hello(): String
}


/**
 * Hello Service Impl
 * Will use HelloMessageData data
 */
class HelloServiceImpl(private val helloMessageData: HelloMessageData) : HelloService {

    override fun hello() = "Hey, ${helloMessageData.message}"
}

/**
 * A class to hold our message data
 */
data class HelloMessageData(val message: String = "Hello Koin!")