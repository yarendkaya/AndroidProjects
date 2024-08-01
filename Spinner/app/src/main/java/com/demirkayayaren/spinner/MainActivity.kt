package com.demirkayayaren.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*val customList = listOf("First", "Second", "Third", "Fourth")
        val adapter = ArrayAdapter<String>(
            this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            customList
        )
        binding.spMonths.adapter = adapter*/

        binding.spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity,
                    "You selected ${parent?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_SHORT
                ).show()


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }
}

