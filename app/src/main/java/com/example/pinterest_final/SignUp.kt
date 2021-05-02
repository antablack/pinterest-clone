package com.example.pinterest_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val edittextEmail = findViewById<EditText>(R.id.edittext_email)

        edittextEmail.requestFocus()

        val btnNext = findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}