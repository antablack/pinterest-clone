package com.example.pinterest_final

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.makeramen.roundedimageview.RoundedTransformationBuilder
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation


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
    }
}