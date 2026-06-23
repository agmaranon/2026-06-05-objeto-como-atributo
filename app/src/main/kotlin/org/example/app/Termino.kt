package org.example.app

class Termino(var escalar: Int, var grado: Int){
    override fun toString(): String{
        return "${escalar}x^${grado}"
    }
}