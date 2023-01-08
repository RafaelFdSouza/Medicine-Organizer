package br.com.rafael.medicineorganizer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rafael.medicineorganizer.R
import br.com.rafael.medicineorganizer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}