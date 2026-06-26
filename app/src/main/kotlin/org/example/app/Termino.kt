package org.example.app

class Termino(var escalar: Int, var grado: Int){
    override fun toString(): String{
        var v1 = if ("${grado}" == "0") {
            "${escalar}"
        } else if ("${grado}" != "0") {
            "${escalar}x^${grado}"
        } else {
            ""
        }
        return v1
    }
}