package com.iv.cohort

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.iv.cohort.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        binding.login.setOnClickListener {
//
//        }
//
//        val email1 = binding.entEmail
//        val email = findViewById<TextInputEditText>(R.id.ent_email)


        val button = findViewById<Button>(R.id.login)
        button.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }



    }
}