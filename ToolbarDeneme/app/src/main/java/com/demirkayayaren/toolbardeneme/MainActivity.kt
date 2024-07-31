package com.demirkayayaren.toolbardeneme

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.settings -> Toast.makeText(this,"You clicked on Settings", Toast.LENGTH_SHORT).show()
            R.id.favorites -> Toast.makeText(this,"You clicked on Favorites ", Toast.LENGTH_SHORT).show()
            R.id.addContact -> Toast.makeText(this,"You clicked on Add Contact", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}