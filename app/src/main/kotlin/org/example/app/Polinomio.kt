package org.example.app

open class Polinomio(var terminos: List<Termino> = ArrayList<Termino>()){
    override fun toString(): String {
        return "${terminos}"
    }
}