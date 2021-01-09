package com.company.kotlinalertproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun save(view : View){
        val editText =findViewById<EditText>(R.id.editTextTextPersonName)
        val savebutton=findViewById<Button>(R.id.buttonAlert)
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Kaydetme")
        val text = editText.text

        alert.setMessage(text)
        alert.setPositiveButton("yes"){dialog, which ->
            Toast.makeText(applicationContext,"Kaydedildi",Toast.LENGTH_LONG).show()
            text.clear()
        }

        alert.setNegativeButton("no") {dialog, which ->

            Toast.makeText(applicationContext,"Kaydedilmedi",Toast.LENGTH_LONG).show()
            text.clear()
        }
        alert.show()
    }
}