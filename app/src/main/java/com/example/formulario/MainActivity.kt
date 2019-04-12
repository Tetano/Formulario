package com.example.formulario

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.sql.Struct

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnlogin = findViewById(R.id.btnlogin) as Button
        var txtemail = findViewById<EditText>(R.id.txtEmail)
        var txtsenha = findViewById<EditText>(R.id.txtSenha)
        var txtsenha2 = findViewById<EditText>(R.id.txtSenha2)
        var flag1 : Boolean = false
        btnlogin.setOnClickListener(){
            if(txtemail.text.toString().isNullOrEmpty()||
                    txtsenha.text.toString().isNullOrEmpty()||
                    txtsenha2.text.toString().isNullOrEmpty()){
                Toast.makeText(
                    getApplicationContext(), "Por favor, preencha os campos",
                    Toast.LENGTH_SHORT
                ).show();
                return@setOnClickListener
            }
            var email : String = txtemail.text.toString()
            var senha : String = txtsenha.text.toString()
            var senha2 : String = txtsenha2.text.toString()
            Log.d("Teste entrou no if", "IF")
            if (senha==senha2){
                flag1 = true
            }
            if (flag1==false){
                Toast.makeText(
                    getApplicationContext(), "Senha Não confere Por favor preencha novamente",
                    Toast.LENGTH_SHORT
                ).show();
                txtsenha.text.clear()
                txtsenha2.text.clear()
            }
        }
    }
}
