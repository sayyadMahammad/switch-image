package com.example.twopicsapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    lateinit var pic1 : ImageView
    lateinit var pic2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "72bf5f02-43fb-4073-a6d9-83e000ce0fcb",
            Analytics::class.java, Crashes::class.java
        )

        pic1=findViewById(R.id.imageView)
        pic2= findViewById(R.id.imageView2)

        pic1.setImageResource(R.drawable.bates)
        pic2.setImageResource(R.drawable.breakingbad)
    }
}