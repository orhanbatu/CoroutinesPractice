package com.orhanbatu.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val myJob = launch {
            delay(2000)
            println("job 1")
            val myJob2 = launch {
                println("job 2")
            }
        }
        myJob.invokeOnCompletion {
            println("myJob is ended")
        }
        myJob.cancel()
    }
}