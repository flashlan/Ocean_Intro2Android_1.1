package com.ocean.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnUpdate.setOnClickListener {
            //tvNome.text = "Everton Kozloski";
            tvNome.text = txtBoxName.text;
            textAge.text = txtBoxAge.text;
        }

        btnClear.setOnClickListener {
            txtBoxName.text.clear();
            txtBoxAge.text.clear();
            tvNome.text = "Your Name"
            textAge.text = "Your Age"
        }
    }
}