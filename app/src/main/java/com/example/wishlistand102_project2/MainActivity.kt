package com.example.wishlistand102_project2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<EachItem>()

        val button = findViewById<Button>(R.id.submitButton)
        val storeEditText = findViewById<EditText>(R.id.whereToBuyET)
        val nameEditText = findViewById<EditText>(R.id.itemNameET)
        val priceEditText = findViewById<EditText>(R.id.priceET)


        val rv = findViewById<RecyclerView>(R.id.rv)

        val adapter = Adapter(list)

        rv.adapter =  adapter

        rv.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {



            var newObject = EachItem(nameEditText.text.toString(), priceEditText.text.toString(), storeEditText.text.toString())

            list.add(newObject)

            adapter.notifyDataSetChanged()

            storeEditText.text.clear()
            nameEditText.text.clear()
            priceEditText.text.clear()



        }

    }


}