package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeUsuario = binding.textView7
        val nome = intent.getStringExtra("nome")
        nomeUsuario.text = nome

        //setContentView(R.layout.activity_tela2)

        val btParaTela3 = binding.btTela2

        btParaTela3.setOnClickListener{
         val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}