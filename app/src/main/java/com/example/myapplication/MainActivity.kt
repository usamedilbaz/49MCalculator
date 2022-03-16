package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.nio.file.Files.find

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Number1: EditText = findViewById(R.id.Number1)
        val Number2: EditText = findViewById(R.id.Number2)
        val Result: TextView = findViewById(R.id.Result)

        val btnsum: Button = findViewById(R.id.btnsum)
        val btnsub: Button = findViewById(R.id.btnsub)
        val btndivide: Button = findViewById(R.id.btndivide)
        val btnmulti: Button = findViewById(R.id.btnmulti)
        btnsum.setOnClickListener {
            val num1: Int = Integer.parseInt(Number1.text.toString())
            val num2: Int = Integer.parseInt(Number2.text.toString())
            val res = num1 + num2
            Result.text = res.toString()
        }
        btnsub.setOnClickListener {
            val num1: Int = Integer.parseInt(Number1.text.toString())
            val num2: Int = Integer.parseInt(Number2.text.toString())
            val res = num1 - num2
            Result.text = res.toString()
        }
        btndivide.setOnClickListener {
            val num1: Int = Integer.parseInt(Number1.text.toString())
            val num2: Int = Integer.parseInt(Number2.text.toString())
            if (num2 > 0) {
                val res = num1 / num2
                Result.text = res.toString()

            } else {
                val res = "Can't calculate"
                Result.text = res.toString()
            }
            btnmulti.setOnClickListener {
                val num1: Int = Integer.parseInt(Number1.text.toString())
                val num2: Int = Integer.parseInt(Number2.text.toString())
                val res = num1 * num2
                Result.text = res.toString()
            }
        }
    }
}