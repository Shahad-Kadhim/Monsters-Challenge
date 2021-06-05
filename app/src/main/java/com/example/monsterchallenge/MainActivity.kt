package com.example.monsterchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monsterchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Arrays.application = this
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycle.adapter=CustomAdapter(Arrays.ARRAY_OF_MEAL)
    }
}