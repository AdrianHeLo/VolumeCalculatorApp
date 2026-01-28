package com.adrianhelo.volumecalculator.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.adrianhelo.volumecalculator.R
import com.adrianhelo.volumecalculator.utils.CalculatorShapes
import com.adrianhelo.volumecalculator.utils.CalculatorShapesImp

class PrismActivity : AppCompatActivity() {

    private val calculator: CalculatorShapes = CalculatorShapesImp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prism)

        val height = findViewById<EditText>(R.id.prism_volume_height)
        val length = findViewById<EditText>(R.id.prism_volume_length)
        val base = findViewById<EditText>(R.id.prism_volume_base)
        val result = findViewById<TextView>(R.id.result_text_view)
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            var number1: Double
            var heightNumber = height.text.toString()
            number1 = Integer.parseInt(heightNumber).toDouble()

            var number2: Double
            var lengthNumber = length.text.toString()
            number2 = Integer.parseInt(lengthNumber).toDouble()

            var number3: Double
            var baseNumber = base.text.toString()
            number3 = Integer.parseInt(baseNumber).toDouble()

            val volume = calculator.prismVolume(number2, number3, number1)

            result.text = volume.toString()
        }


    }
}