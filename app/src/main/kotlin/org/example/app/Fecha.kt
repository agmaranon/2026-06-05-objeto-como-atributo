package org.example.app

class Fecha(private var dia:Int, private var mes:Int, private var anho:Int){
    override fun toString():String{
        return "hoy es ${dia}/${mes}/${anho}"
    }
}