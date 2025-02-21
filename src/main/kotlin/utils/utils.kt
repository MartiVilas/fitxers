package utils

import java.util.*

/**
 * Document kt dedicat al emmagatzematge de funcions de lectura de Int, Double, Float, Long, Word, Char per poder usar
 * en les funcions dels projectes.
 * @author Raimon Izard, David Marin i Martí Vilàs.
 */
fun llegirInt():Int {
    //cridem a la llibreria de Scanner
    val scanner=Scanner(System.`in`)
    // instanciem una variable entera, ja que el que volem llegir es un enter
    var num:Int=0
    // fem una variable de control pel do while
    var error = true
    do {
        if (scanner.hasNextInt()){
            // si el buffer conté un número llavors llegim el número del buffer y el error es torna false per poder sortir
            num=scanner.nextInt()
            error=false
        }else {
            // si el buffer no conté cap número llavors mostra un missatge d'error
            scanner.nextLine()
            println("${RED}ERROR HA DE SER UN NÚMERO ENTER${RESET}")
        }
    }while (error)
    return num
}

fun llegirDouble():Double {
    val scanner=Scanner(System.`in`)
    var num:Double=0.0
    var error = true
    do {if (scanner.hasNextDouble()){
        num=scanner.nextDouble()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirFloat():Float {
    val scanner=Scanner(System.`in`)
    var num:Float = 0.0f
    var error = true
    do {if (scanner.hasNextFloat()){
        num=scanner.nextFloat()
        error=false
    }else {
        scanner.nextLine()
        println("${RED}ERROR HA DE SER UN NÚMERO FLOAT${RESET}")
    }
    }while (error)
    return num
}

fun llegirLong():Long {
    val scanner=Scanner(System.`in`)
    var num:Long=0
    var error = true
    do {if (scanner.hasNextLong()){
        num=scanner.nextLong()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirWord(pMessageIn: String, pMessageErrorDT: String): String {
    val scanner=Scanner(System.`in`)
    val outputValue: String
    do {
        println(pMessageIn)
        if (!scanner.hasNext()) {
            println("ERROR: $pMessageErrorDT")
            scanner.next()
        } else {
            outputValue = scanner.next()
            scanner.nextLine()
            return outputValue
        }
    } while (true)
}

fun llegirChar( pCase: Int = -1): Char {
    val scanner=Scanner(System.`in`)
    val outputValue: Char
    do {
        if (!scanner.hasNext()) {
            scanner.next()
        } else {
            outputValue = scanner.next()[0]
            scanner.nextLine() // clear buffer
            when (pCase) {
                0 -> return outputValue.lowercaseChar()
                1 -> return outputValue.uppercaseChar()
                else -> return outputValue
            }
        }
    } while (true)
}

fun llegirStrings(pMessageIn: String, pMessageErrorDT: String): String{
    val scanner=Scanner(System.`in`)

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scanner.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scanner.nextLine()
        }
    }while(!correctDataType)

    return outputValue
}

/**
 * Aquest document està destinat a emmagatzemar funcions generals que puguin ser utilitzades en diferents projectes.
 * @author Martí Vilàs
 */
fun llegirSioNo() : Boolean {
    var scanner=Scanner(System.`in`)
    val resposta=scanner.nextLine().lowercase()

    return when (resposta) {
        "s" -> true
        "n" -> false
        else -> {
            println("Resposta no vàlida la resposta ha de ser S o N")
            llegirSioNo()
        }
    }
}

fun readInt ():Int {
    val scanner=Scanner(System.`in`)
    var num:Int= 0
    var error = true
    do {if (scanner.nextInt()==1||scanner.nextInt()==2){
        num=scanner.nextInt()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)

    return num

}

fun llegirEntre1o2(): Int {
    val scanner = Scanner(System.`in`)
    var numero: Int = 0
    var error = true

    do {
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt()
            if (numero in 1..2) {
                error = false
            } else {
                println("Per favor, ingressa un valor vàlid (1 o 2).")
            }
        } else {
            println("Per favor, ingressa un número enter.")
            scanner.nextLine()
        }
    } while (error)
    return numero
}