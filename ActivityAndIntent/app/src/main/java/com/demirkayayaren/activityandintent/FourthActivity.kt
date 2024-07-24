package com.demirkayayaren.activityandintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.activityandintent.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val receivedBundle = intent.extras
        if (receivedBundle != null) {
            val receivedName = receivedBundle.getString("NAME")
            val receivedAge = receivedBundle.getInt("INT")
            val receivedCountry = receivedBundle.getString("COUNTRY")


            /*  val name = intent.getStringExtra("Extra name ")
              val age = intent.getIntExtra("Extra age ", 0)
              val country = intent.getStringExtra("Extra country")
              val personString = "$name is $age years old and lives in $country"

              binding.tvPerson.text = personString
      */

        }
    }
}