package org.example.app

class Persona (private var nombre:String, private var apellido:String, private var fecha:Fecha){
    override fun toString():String{
        return "Me llamo ${nombre} ${apellido}, ${fecha}"
    }
}