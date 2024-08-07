package com.demirkayayaren.swipableviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.anger,
            R.drawable.disgust,
            R.drawable.fear,
            R.drawable.joy,
            R.drawable.sadness
        )

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        /*  viewPager.beginFakeDrag()
          viewPager.fakeDragBy(-10f)
          viewPager.endFakeDrag()*/
    }

}