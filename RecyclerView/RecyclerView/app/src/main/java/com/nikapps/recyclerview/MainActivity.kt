package com.nikapps.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = generateDummyList()
        customAdapter = CustomAdapter(itemList)
        recyclerView.adapter = customAdapter
    }

    private fun generateDummyList(): List<CustomItem> {
        return listOf(
            CustomItem(R.drawable.img, "Item 1", false),
            CustomItem(R.drawable.img_1, "Item 2", false),
            CustomItem(R.drawable.img_2, "Item 3", false),
            CustomItem(R.drawable.img_3, "Item 4", false),
            CustomItem(R.drawable.img_4, "Item 5", false)
        )
    }
}
