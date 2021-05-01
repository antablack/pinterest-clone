package com.example.pinterest_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.login_toolbar)
        setSupportActionBar(toolbar)
        //toolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_baseline_arrow_back_ios_24))
        val textviewPrivacy : TextView = findViewById(R.id.textview_privacy)
        textviewPrivacy.setText(Html.fromHtml("By continuing, you agree to Pinterest's <b>Terms of Service</b> and <b>Privacy Policy</b>"))


    }
}