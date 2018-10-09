package com.lenghel.michael.emojidictionary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    // lateinit states that I'll assign the variable later
    //LinearLayoutManager is an alternative. Remember to match parent in linear layout
    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        adapter = EmojiAdapter(arrayListOf("👍", "😃", "\uD83C\uDF85"))
        recyclerView.adapter = adapter
    }
}
