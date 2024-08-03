package com.demirkayayaren.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.demirkayayaren.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val todoList = mutableListOf(
            Todo("Follow AndroidDevs", false),
            Todo("Learn about RecyclerView", true),
            Todo("Feed the cat", false),
            Todo("Prank my boss", false),
            Todo("Eat some curry", true),
            Todo("Ask my crush out", false),
        )
        val adapter = TodoAdapter(todoList)

        binding.rvToDo.adapter = adapter
        binding.rvToDo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.btnAddToDo.setOnClickListener {
            val title = binding.etToDo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)

            adapter.notifyItemInserted(todoList.size - 1)

        }
    }
}