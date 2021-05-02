package com.example.pinterest_final

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.makeramen.roundedimageview.RoundedTransformationBuilder


class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
/*
        val imageBedroom = findViewById<ImageView>(R.id.image_bedroom)
        val transformation: Transformation = RoundedTransformationBuilder()
            .borderColor(Color.BLACK)
            .borderWidthDp(3f)
            .cornerRadiusDp(30f)
            .oval(false)
            .build()
        Picasso.get()
            .load(R.drawable.bedroom)
            .transform(transformation)
            .into(imageBedroom);*/
        findViewById<ImageView>(R.id.image_bedroom).setOnClickListener(this::handler)
        findViewById<ImageView>(R.id.image_livingroom).setOnClickListener(this::handler)
        findViewById<ImageView>(R.id.image_bathroom).setOnClickListener(this::handler)
        findViewById<ImageView>(R.id.image_outdoor).setOnClickListener(this::handler)
        findViewById<ImageView>(R.id.image_homeoffice).setOnClickListener(this::handler)
        findViewById<ImageView>(R.id.image_kitchen).setOnClickListener(this::handler)
    }

    fun handler(view: View?) : Unit {
        lateinit var toast: Toast;
        when (view?.id) {
            R.id.image_bedroom -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_bedroom).text , Toast.LENGTH_SHORT)
            }
            R.id.image_livingroom -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_livingroom).text , Toast.LENGTH_SHORT)
            }
            R.id.image_bathroom -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_bathroom).text , Toast.LENGTH_SHORT)
            }
            R.id.image_outdoor -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_outdoor).text , Toast.LENGTH_SHORT)
            }
            R.id.image_homeoffice -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_homeoffice).text , Toast.LENGTH_SHORT)
            }
            R.id.image_kitchen -> {
                toast = Toast.makeText(applicationContext, getString(R.string.lbl_you_selected) + ": " + findViewById<TextView>(R.id.textView_kitchen).text , Toast.LENGTH_SHORT)
            }
        }
        toast.show()
    }
}