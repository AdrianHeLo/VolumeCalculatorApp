package com.adrianhelo.volumecalculator.utils

import kotlin.math.pow

class CalculatorShapesImp: CalculatorShapes {
    private val pi = 3.1416

    override fun sphereVolume(r: Double): Double {
        val v = (4/3) * pi * (r.pow(3.0))
        return v
    }

    override fun cylinderVolume(r: Double, h: Double): Double {
        val v = pi*(r.pow(2.0))*h
        return v
    }

    override fun cubeVolume(a: Double): Double{
        val v = a.pow(3.0)
        return v
    }

    override fun prismVolume(l: Double, b: Double, h: Double): Double{
        val v = l*b*h
        return v
    }

}