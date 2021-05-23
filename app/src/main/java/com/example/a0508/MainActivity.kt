package com.example.a0508

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Log in", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("DEBUG", "app onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DEBUG", "app onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DEBUG", "app onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DEBUG", "123")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG", "app onDestroy")
    }

    fun go2page2(p1:View){
        startActivity(Intent(this,MainActivity2::class.java))
    }
}