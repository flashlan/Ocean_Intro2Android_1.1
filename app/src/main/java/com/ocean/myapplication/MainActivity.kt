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
            tvNome.text = txtBox.text;
        }

        btnClear.setOnClickListener {
            txtBox.text.clear();
            tvNome.text = "Seu nome aparecerá aqui"
        }
    }
}