package com.android.architechture.feature2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.architechture.R

class ChildActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
    }
}
