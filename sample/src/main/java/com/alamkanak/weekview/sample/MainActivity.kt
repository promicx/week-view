package com.alamkanak.weekview.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBasic.setOnClickListener {
            val intent = Intent(this@MainActivity, BasicActivity::class.java)
            startActivity(intent)
        }

        buttonAsynchronous.setOnClickListener {
            val intent = Intent(this@MainActivity, AsynchronousActivity::class.java)
            startActivity(intent)
        }
    }
}
