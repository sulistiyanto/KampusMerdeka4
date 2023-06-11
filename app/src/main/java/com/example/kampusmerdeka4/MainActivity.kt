package com.example.kampusmerdeka4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kampusmerdeka4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("kampus_merdeka", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("name", "Angga")
        editor.putInt("age", 20)
        editor.apply()
        val stringValue: String? = sharedPreferences.getString("name", "")
        stringValue?.let { Log.d("KESINI nama", it) }
    }
}