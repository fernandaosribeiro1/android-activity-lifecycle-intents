package com.example.ado1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log // Import necessário para o Log.d
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Tag para filtrar os logs no Logcat
    private val TAG = "CicloDeVidaADO"



    // 1º Momento: Activity está sendo criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "1. onCreate() - Activity está sendo criada e configurada.")

        // Adiciona listener ao botão "Abrir Navegador" (TextView com id="button")
        val getStartedButton = findViewById<TextView>(R.id.button)
        getStartedButton.setOnClickListener {
            abrirNavegador()
        }

        // Adiciona listener ao botão "Compartilhar" (TextView com id="buttonCompartilhar")
        val shareButton = findViewById<TextView>(R.id.buttonCompartilhar)
        shareButton.setOnClickListener {
            compartilharConteudo()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // 2º Momento: Activity está visível
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "2. onStart() - Activity está visível para o usuário.")
    }

    // 3º Momento: Activity perde o foco (ocorre ao chamar um Intent externo)
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "3. onPause() - Activity perdeu o foco. (Intent externo chamado).")
    }

    // Opcional: Adicionar onResume() para ver o retorno.
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() - Activity retornou ao foco.")
    }


    // TIPO 1: Implicit Intent - Abrir o Navegador
    private fun abrirNavegador() {
        val url = "https://www.google.com"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
        Log.d(TAG, "Intent 1: Chamado ACTION_VIEW (Abrir Navegador).")
    }

    // TIPO 2: Implicit Intent - Compartilhar Conteúdo
    private fun compartilharConteudo() {
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Texto para compartilhamento ADO1.")
        }
        // createChooser exibe a lista de apps para compartilhamento
        startActivity(Intent.createChooser(shareIntent, "Compartilhar via"))
        Log.d(TAG, "Intent 2: Chamado ACTION_SEND (Compartilhar Conteúdo).")
    }
}