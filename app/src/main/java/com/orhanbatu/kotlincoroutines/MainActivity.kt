package com.orhanbatu.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*runBlocking {
            launch {
                delay(2000)
                println("run blocking works")
            }
        }

        println("Coroutine Scope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope End")

        runBlocking {
            launch {
                delay(5000)
                println("run Blocking")
            }
            coroutineScope {
                launch {
                    delay(3000)
                    println("coroutine scope")
                }
            }
        }*/

        runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread : ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread : ${Thread.currentThread().name}")
            }
        }
    }
}