package sungil.mybmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val heightEditText = findViewById<EditText>(R.id.heightEditText)
        val widthEditText = findViewById<EditText>(R.id.widthEditText)
        val resultButton = findViewById<Button>(R.id.resultButton)
        resultButton.setOnClickListener()
        {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name",nameEditText.text.toString())
            intent.putExtra("height",heightEditText.text.toString().toInt())
            intent.putExtra("width",widthEditText.text.toString().toInt())
            startActivity(intent)
        }
    }
}