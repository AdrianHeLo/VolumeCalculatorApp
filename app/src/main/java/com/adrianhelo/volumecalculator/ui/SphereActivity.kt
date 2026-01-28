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

class SphereActivity : AppCompatActivity() {

    private val calculator: CalculatorShapes = CalculatorShapesImp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sphere)

        val radius = findViewById<EditText>(R.id.sphere_volume_height)
        val result = findViewById<TextView>(R.id.sphere_result_text_view)
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            val r: Double
            val radiusNumber = radius.text.toString()
            r = Integer.parseInt(radiusNumber).toDouble()
            val calculate = calculator.sphereVolume(r)
            result.text = calculate.toString()
        }
    }
}