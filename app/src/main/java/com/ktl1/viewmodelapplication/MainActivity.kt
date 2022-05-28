package com.ktl1.viewmodelapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    //    private var viewModel = ViewModelMainActivity()
    private lateinit var viewModel: ViewModelMainActivity // this is important


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ViewModelMainActivity::class.java)

        val text = findViewById<TextView>(R.id.textView)
        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

//        text.text = viewModel.count.toString() // this is important

        viewModel.count.observe(this, Observer {
            text.text = it.toString()
        })

        button.setOnClickListener {
            viewModel.increment() // this is important
//            text.text = viewModel.count.toString() // this is important
        }
    }
}