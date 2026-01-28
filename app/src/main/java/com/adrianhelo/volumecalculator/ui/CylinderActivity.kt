package com.adrianhelo.volumecalculator.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adrianhelo.volumecalculator.R
import com.adrianhelo.volumecalculator.R.id.result_text_view
import com.adrianhelo.volumecalculator.utils.CalculatorShapes
import com.adrianhelo.volumecalculator.utils.CalculatorShapesImp

class CylinderActivity : AppCompatActivity() {

    private val calculator: CalculatorShapes = CalculatorShapesImp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cylinder)

        val height = findViewById<EditText>(R.id.cylinder_volume_height)
        val radius = findViewById<EditText>(R.id.cylinder_volume_length)
        val result = findViewById<TextView>(R.id.cylinder_result_text_view)
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            val h: Double
            val heightNumber = height.text.toString()
            h = Integer.parseInt(heightNumber).toDouble()

            val r: Double
            val radiusNumber = radius.text.toString()
            r = Integer.parseInt(radiusNumber).toDouble()

            val calculate = calculator.cylinderVolume(r, h)
            result.text = calculate.toString()
        }

    }
}