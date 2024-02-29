package com.orhanbatu.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(2000)
        println("Run Blocking")
        myFunction()
    }
}
suspend fun myFunction() {
    coroutineScope {
        delay(4000)
        println("Suspend Function")
    }
}