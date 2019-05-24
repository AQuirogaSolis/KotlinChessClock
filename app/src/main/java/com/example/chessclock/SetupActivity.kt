package com.example.chessclock

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setup.*

class SetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)


        var btnNavigate = findViewById<ImageButton>(R.id.startButton)

        btnNavigate!!.setOnClickListener {
                val intent = Intent(this, ClockActivity::class.java)
                startActivity(intent)

        }
    }
}
