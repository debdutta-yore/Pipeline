package com.example.pipeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btSum: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null)
        {
            etFirst = findViewById(R.id.etInputFirst)
            etSecond = findViewById(R.id.etInputSecond)
            btSum = findViewById(R.id.btSum)
            tvResult = findViewById(R.id.tvResult)

            btSum.setOnClickListener {
                doSum()
            }
        }
    }

    private fun doSum() {
        try{
            val first = etFirst.text.toString().toInt()
            val second = etSecond.text.toString().toInt()

            val result = calculateSum(first,second)
            tvResult.text = result.toString()
        }
        catch (ex: Exception){
            tvResult.text = "Error"
        }
    }

    private fun calculateSum(first: Int, second: Int): Int {
        return Calculator.sum(first, second)
    }
}