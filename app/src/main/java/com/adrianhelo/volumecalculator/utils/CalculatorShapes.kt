package com.adrianhelo.volumecalculator.utils

import kotlin.math.pow

interface CalculatorShapes {

    fun cylinderVolume(r: Double, h: Double): Double
    fun cubeVolume(a: Double): Double
    fun prismVolume(l: Double, b: Double, h: Double): Double
    fun sphereVolume(r: Double): Double
}