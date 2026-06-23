package org.example.app

open class Polinomio(var terminos: List<Termino> = ArrayList<Termino>()){
    override fun toString(): String {
        for (p in terminos){
            println(p)
        }
        return "${terminos}"
    }
    
}