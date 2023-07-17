package com.hakanbayazithabes.workoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.hakanbayazithabes.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flStartButton: FrameLayout = findViewById(R.id.flStart)
        flStartButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Here we will start the exercise", Toast.LENGTH_LONG)
                .show()
        }
    }
}