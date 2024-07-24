package com.demirkayayaren.activityandintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.activityandintent.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.btnApply.setOnClickListener {

            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()

            val bundle= Bundle().apply {
                putString("NAME",name)
                putInt("INT", age)
                putString("COUNTRY",country)
            }

            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

            /*startActivity(Intent(this, FourthActivity::class.java).also {
                it.putExtra("Extra name ", name)
                it.putExtra("Extra age ", age)
                it.putExtra("Extra country", country)
            })
*/
        }
    }
}