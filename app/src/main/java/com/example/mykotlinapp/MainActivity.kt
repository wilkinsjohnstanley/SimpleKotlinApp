package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var et_a : EditText
    lateinit var et_b : EditText
    lateinit var resultTv : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMul = findViewById(R.id.btn_mul)
        btnDiv = findViewById(R.id.btn_mul)
        et_a = findViewById(R.id.et_a)
        et_b = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.resultTv)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(v: View?) {
        var a = et_a.text.toString().toDouble()
        var b = et_b.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a + b
            }
            R.id.btn_sub ->{
                result = a - b
            }
            R.id.btn_mul ->{
                result = a * b
            }
            R.id.btn_div ->{
                result = a / b
            }
        }
        resultTv.text = "Result is $result"

    }
}