package com.example.helloworld

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setBackgroundColor(Color.RED);

        button.setOnClickListener {
            Log.v("helloButton","pressed")
            val toast=Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT)
            //seems like getView is deprecated, need to find a newer way
            toast.view?.backgroundTintList = ColorStateList.valueOf(Color.GREEN);

            toast.show()
        }
    }
}