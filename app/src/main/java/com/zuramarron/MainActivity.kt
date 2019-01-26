package com.zuramarron

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var  text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         text = findViewById<TextView>(R.id.text_click)
        val button = findViewById<Button>(R.id.button_text)

        button.setOnClickListener { view ->
            Toast.makeText(this,  "目ん玉ついてんのか！！", Toast.LENGTH_LONG).show()
            button.setText("敗北者")
        }
    }

    override fun onPause() {
        super.onPause()
        text.setText("おちんちんらんど")
    }
}
