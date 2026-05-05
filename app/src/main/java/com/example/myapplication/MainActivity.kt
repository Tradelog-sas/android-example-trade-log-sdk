package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.open_compose_button).setOnClickListener {
            startActivity(Intent(this, ComposeActivity::class.java))
        }

        findViewById<Button>(R.id.open_xml_button).setOnClickListener {
            startActivity(Intent(this, XmlActivity::class.java))
        }
    }
}
