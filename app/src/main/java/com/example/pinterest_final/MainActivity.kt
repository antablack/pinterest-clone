package com.example.pinterest_final

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme(R.)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.login_toolbar)
        setSupportActionBar(toolbar)
        //toolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_baseline_arrow_back_ios_24))
        val textviewPrivacy : TextView = findViewById(R.id.textview_privacy)
        val terms = getString(R.string.lbl_terms);
        textviewPrivacy.setText(Html.fromHtml(terms))

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("")
                .setMessage(getString(R.string.dialog_message))
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(R.string.ok,
                    DialogInterface.OnClickListener { dialog, whichButton ->
                        val intent = Intent(this, SignUp::class.java)
                        startActivity(intent)
                    })
                .setNegativeButton(R.string.cancel, null).show()
        }

        val btnFacebook: Button = findViewById(R.id.btn_facebook)
        val btnGoogle: Button = findViewById(R.id.btn_google)
        val btnApple: Button = findViewById(R.id.btn_apple)

        btnFacebook.setOnClickListener(this::handler)
        btnGoogle.setOnClickListener(this::handler)
        btnApple.setOnClickListener(this::handler)
    }

    fun handler(view: View?) : Unit {
        val btn = view as Button
        val toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + btn.text, Toast.LENGTH_SHORT)
        toast.show()
    }
}