package com.adrianhelo.volumecalculator.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.adrianhelo.volumecalculator.ui.CylinderActivity
import com.adrianhelo.volumecalculator.ui.PrismActivity
import com.adrianhelo.volumecalculator.R
import com.adrianhelo.volumecalculator.ui.CubeActivity
import com.adrianhelo.volumecalculator.ui.SphereActivity
import com.adrianhelo.volumecalculator.ui.adapters.ShapeAdapter
import com.adrianhelo.volumecalculator.ui.models.Shape

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // ListView
        val gridView: GridView = findViewById(R.id.grid_view)
        // Data Source
        var shape1 = Shape("Cube", R.drawable.cube)
        var shape2 = Shape("Sphere", R.drawable.sphere)
        var shape3 = Shape("Cylinder", R.drawable.cylinder)
        var shape4 = Shape("Prism", R.drawable.prism)
        val shapes = listOf<Shape>(shape1, shape2, shape3, shape4)

        // Custom Adapter
        val adapter = ShapeAdapter(this, shapes)
        //Binding Adapter
        gridView.adapter = adapter

        gridView.setOnItemClickListener{_, _, it, _ ->
            val clickedItem = adapter.getItem(it)

            if (clickedItem?.shapeName.equals("Cube")){
                val i = Intent(this, CubeActivity::class.java)
                startActivity(i)
            } else if (clickedItem?.shapeName.equals("Sphere")){
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)
            } else if (clickedItem?.shapeName.equals("Cylinder")){
                val i = Intent(this, CylinderActivity::class.java)
                startActivity(i)
            } else {
                val i = Intent(this, PrismActivity::class.java)
                startActivity(i)
            }
        }
    }
}