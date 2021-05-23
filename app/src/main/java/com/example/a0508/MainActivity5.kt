package com.example.a0508

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main5.*
import java.util.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        switch1.setOnCheckedChangeListener{switch1,isChecked ->
            val state=switch1.isChecked
            if(state){
                Toast.makeText(this, "開啟提醒", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "關閉提醒", Toast.LENGTH_LONG).show()
            }
        }
        button3.setOnClickListener{
            val calendar=Calendar.getInstance()
            val hour=calendar.get(Calendar.HOUR_OF_DAY)
            val minute=calendar.get(Calendar.MINUTE)
            TimePickerDialog(this,{
                _,hour,minute->textView.text="時間:$hour:$minute"},hour,minute,true).show()
        }
    }



}