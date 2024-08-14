package com.demirkayayaren.slidablemenu

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.demirkayayaren.slidablemenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle //burada lateinit var kullanmamızın sebebi ne

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(
                this@MainActivity,
                drawerLayout,
                R.string.open,
                R.string.close
            )
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.miItem1 -> {
                        Toast.makeText(this@MainActivity, "First item clicked", Toast.LENGTH_SHORT)
                            .show()
                    }

                    R.id.miItem2 -> {
                        Toast.makeText(this@MainActivity, "Second item clicked", Toast.LENGTH_SHORT)
                            .show()
                    }

                    R.id.miItem3 -> {
                        Toast.makeText(this@MainActivity, "Third item clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
                true

            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}