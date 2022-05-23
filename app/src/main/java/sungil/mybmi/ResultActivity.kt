package sungil.mybmi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class ResultActivity : AppCompatActivity()
{
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("name")
        val height = intent.getIntExtra("height", 0)
        val width = intent.getIntExtra("width", 0)

        val bmi = width / (height * 0.01).pow(2)

        val resultText = when
        {
            bmi >= 30 -> "비만"
            bmi >= 25 -> "과체중"
            bmi >= 20 -> "정상"
            else -> "저체중"
        }

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        resultTextView.text = "${name}님의 BMI는 ${bmi}입니다. 결과는 ${resultText}입니다."
        Toast.makeText(this,"${name}/${height}/${width}",Toast.LENGTH_SHORT).show()
    }
}