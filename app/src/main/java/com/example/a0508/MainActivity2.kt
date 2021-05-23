package com.example.a0508

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button.setOnClickListener{
            val alert=AlertDialog.Builder(this)
            alert.setMessage("是否清除帳密？")
            alert.setTitle("確認視窗")
            alert.setPositiveButton("確認",null)
            alert.setNegativeButton("取消",null)
            alert.show()
            }
        imageView5.setOnClickListener {
            val no_access=AlertDialog.Builder(this)
            no_access.setMessage("您沒有管理員權限")
            no_access.setTitle("錯誤")
            no_access.setPositiveButton("我知道了",null)
            no_access.show()
        }
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

    fun is_res(r: View){
        startActivity(Intent(this,MainActivity3::class.java))
    }

    fun is_mgr(m: View){
        startActivity(Intent(this,MainActivity4::class.java))
    }

}