package com.example.myandroidgroupv3

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myandroidgroupv3.model.Add
import com.example.myandroidgroupv3.model.User

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val add = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("add", Add::class.java)
        } else {
            intent.getParcelableExtra("add") as? Add?
        }

        add?.let {
            val addIcon = findViewById<ImageView>(R.id.addIcon)
            val addText = findViewById<TextView>(R.id.addText)
            val addCard = findViewById<androidx.cardview.widget.CardView>(R.id.addContainer)

            addIcon.setImageResource(it.icon)
            addText.text = it.text
            addCard.setCardBackgroundColor(it.bgColor)

            addCard.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }
        }

    }
}