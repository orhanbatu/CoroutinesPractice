package com.orhanbatu.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class DispatcherCoroutines {

    fun main() {
        //Dispatchers
        runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("IO Default : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("IO Unconfined : ${Thread.currentThread().name}")
            }
        }
    }
}