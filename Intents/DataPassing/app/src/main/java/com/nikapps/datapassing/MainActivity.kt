package com.nikapps.datapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nikapps.datapassing.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate Called")
    }
    override fun onResume(){
        super.onResume()
        println("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause Called")

    }

    override fun onStop() {
        super.onStop()
        println("onStop Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Called")

    }

    fun next(view : View){
        val intent = Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("username", binding.userNameText.text.toString())
        intent.putExtra("email", binding.emailText.text.toString())
        startActivity(intent)
        finish()
    }
}