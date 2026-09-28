package com.example.myandroidgroupv3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        println("my_lifecycle : onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("my_lifecycle : onStart")
    }

    override fun onResume() {
        super.onResume()
        println("my_lifecycle : onResume")
    }

    override fun onPause() {
        super.onPause()
        println("my_lifecycle : onPause")
    }

    override fun onStop() {
        super.onStop()
        println("my_lifecycle : onStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("my_lifecycle : onRestart")
    }

    override fun onDestroy() {
        println("my_lifecycle : onDestroy")
        super.onDestroy()
    }
}