package org.example

import org.example.app.Persona
import org.example.app.Fecha
import org.example.app.Polinomio
import org.example.app.Cuadratica
import org.example.app.CuadraticaMejor
import org.example.app.Cuatrinomio

fun main() {
    println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
    println(Polinomio())
    println(Cuadratica())
    println(CuadraticaMejor())
    var objeto : Polinomio
    objeto = Cuadratica()
    println(objeto)
    objeto = CuadraticaMejor()
    println(objeto)
    var lista = ArrayList <Polinomio>()
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    for (p in lista){
        println(p)
    }
    println(lista)
    println(Cuatrinomio())
}