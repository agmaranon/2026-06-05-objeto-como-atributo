package org.example

import org.example.app.Persona
import org.example.app.Fecha
import org.example.app.Polinomio
import org.example.app.Cuadratica
import org.example.app.CuadraticaMejor
import org.example.app.Cuatrinomio
import org.example.app.Termino

fun main() {
    /*println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
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
    println("---------------------------")*/
    var t1 = Termino(2,2)
    var t2 = Termino(4,1)
    var t3 = Termino(-3,0)
    var p1 = Polinomio(listOf(t1,t2,t3))
    var t4 = Termino(1,2)
    var t5 = Termino(6,1)
    var t6 = Termino(-2,0)
    var t7 = Termino(4,2)
    var p2 = Polinomio(listOf(t1,t2,t3))
    println(p1)
    println(p2)
}