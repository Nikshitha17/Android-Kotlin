package com.nikapps.languagesupportapp

import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nikapps.languagesupportapp.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var myLocale: Locale? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnHindi.setOnClickListener {
            Log.d("LocaleChange", "Hindi button clicked")
            setLocale("hi")
        }

        binding.btnEnglish.setOnClickListener {
            Log.d("LocaleChange", "English button clicked")
            setLocale("en")
        }

        binding.btnTamil.setOnClickListener {
            Log.d("LocaleChange", "Tamil button clicked")
            setLocale("ta")
        }
    }

    private fun setLocale(localeName: String) {
        Log.d("LocaleChange", "Setting locale to: $localeName")
        val locale = Locale(localeName)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        val refresh = Intent(this, MainActivity::class.java)
        startActivity(refresh)
        finish()
    }
}
