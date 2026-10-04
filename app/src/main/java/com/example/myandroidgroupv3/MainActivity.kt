package com.example.myandroidgroupv3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myandroidgroupv3.model.Add
import com.example.myandroidgroupv3.model.User
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.myButton)
        clickMeButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            val add = Add(
                R.drawable.ic_menu,
                R.color.myCustomColor,
                "Salam her kese, yeni packet abone olun!"
            )
           intent.putExtra("add",add)
            startActivity(intent)
//            showMessage("click me is clicked!")
        }
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

    private fun View.showMessage(message : String) {
        Snackbar.make(this,message,Snackbar.LENGTH_SHORT).show()
    }

    private fun Context.showMessage(message : String) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}