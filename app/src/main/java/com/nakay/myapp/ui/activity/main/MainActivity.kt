package com.nakay.myapp.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nakay.myapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // to change title of activity
        val actionBar = supportActionBar
        actionBar?.title = "Main"
    }
}
