package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.empregaeu4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edUsuario
        val btLogin = binding.btLogin
        val edSenha2 = binding.edSenha

        btLogin.setOnClickListener {
            if(edNome.text.toString()=="Diogo") {
                //val text = edNome.text.toString()
                //Toast.makeText(this, texto, toast.LENGTH_SHORT.show()
                val intent = Intent(this, Tela2Activity::class.java)
                val texto = edNome.text.toString()
                val passow = edSenha2.text.toString()
                intent.putExtra("nome", texto)
                intent.putExtra("senha", passow)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
        //setContentView(R.layout.activity_main)
    }
}