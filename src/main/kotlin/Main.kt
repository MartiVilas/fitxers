package org.example

import utils.llegirInt
import utils.llegirStrings
import java.nio.file.StandardOpenOption
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writeText


fun main() {


    val path = Path("./txt/fitxer.txt")
    val fraseUsuari: String = llegirStrings("Digues la frase que vols afegir al fitxer","Frase no vàlida")
    path.writeText("\n"+fraseUsuari, options = arrayOf(StandardOpenOption.APPEND))
    if(fraseUsuari.contains("@ESBORRA")){
        path.writeText("")
    }

    println("Contingut:")
    path.forEachLine { println(it) }
    print("Digues quina linia vols mostrar: ")
    val liniaAMostrar: Int = llegirInt()


}