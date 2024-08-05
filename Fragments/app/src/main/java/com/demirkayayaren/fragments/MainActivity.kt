package com.demirkayayaren.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        binding.btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null) // When you click back arrow, your activity will close.
                //If you don't want it you need to stack the fragments with this fun.
                commit()
            }
        }

        binding.btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)// When you click back arrow, your activity will close.
                //If you don't want it you need to stack the fragments with this fun.
                commit()
            }
        }
    }
}