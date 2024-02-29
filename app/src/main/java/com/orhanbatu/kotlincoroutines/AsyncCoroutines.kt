package com.orhanbatu.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun test() {
    runBlocking {
        launch {
            val downloadedName = downloadName()
        }
        launch {
            val downloadAge = downloadAge()
        }
        println("${downloadName()}, ${downloadAge()}")
    }
}
fun main() {
    var userName = ""
    var userAge = 0

    runBlocking {
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }
        userName = downloadedName.await()
        userAge = downloadedAge.await()
        //Await means, wait until these variables get their values.
    }
}
suspend fun downloadName() : String {
    delay(2000)
    val userName = "Orhan: "
    println("username download")
    return userName
}
suspend fun downloadAge() : Int {
    delay(4000)
    val userAge = 24
    println("userage download")
    return userAge
}