package com.example.mnogowat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Author(view: View)
    {
        val authorIntent = Intent(this, ActivityAuthor::class.java)
        startActivity(authorIntent)
    }
}