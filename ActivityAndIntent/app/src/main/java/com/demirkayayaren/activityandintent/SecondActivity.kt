package com.demirkayayaren.activityandintent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.activityandintent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.btnOpenMainActivity.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnOrder.setOnClickListener {

        }
        binding.btnShowToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                this.view =
                    layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.ctToast))
                show()
            }
        }


    }
}