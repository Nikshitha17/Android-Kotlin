package com.nikapps.datapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nikapps.datapassing.databinding.ActivityNextBinding

private lateinit var binding : ActivityNextBinding

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")

        binding.userNameTextNext.text = "Username: " + username
        binding.emailTextNext.text = "EmailID: " + email
    }
}