package com.demirkayayaren.activityandintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.activityandintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnOpenSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btnAdd.setOnClickListener {
            val firstNumber = binding.etFirstNumber.text.toString().toInt()
            val secondNumber = binding.etSecondNumber.text.toString().toInt()
            sum = firstNumber + secondNumber
            binding.tvResult.text = sum.toString()
        }


        binding.btnAddImage.setOnClickListener {
            binding.ivImage.visibility = View.VISIBLE

        }
    }
}