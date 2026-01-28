package com.adrianhelo.volumecalculator.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.adrianhelo.volumecalculator.R
import com.adrianhelo.volumecalculator.R.id.result_text_view
import com.adrianhelo.volumecalculator.utils.CalculatorShapes
import com.adrianhelo.volumecalculator.utils.CalculatorShapesImp

class CubeActivity : AppCompatActivity() {

    private val calculator: CalculatorShapes = CalculatorShapesImp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val height = findViewById<EditText>(R.id.cube_volume_height)
        val result = findViewById<TextView>(result_text_view)
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            val a: Double
            val heightNumber = height.text.toString()
            a = Integer.parseInt(heightNumber).toDouble()
            val calculate = calculator.cubeVolume(a)
            result.text = calculate.toString()
        }

    }
}