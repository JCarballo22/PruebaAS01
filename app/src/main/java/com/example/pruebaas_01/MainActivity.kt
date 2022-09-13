package com.example.pruebaas_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hola Alumnos!!!")

        val nombre:String = "Pedro"
      /**  nombre = "Pedri" **/
        var apellido:String = "Lopez"
        apellido="López"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var nombreCompleto = nombre+" "+apellido
        println(nombreCompleto)
        apellido = "LóPEZ"
        nombreCompleto = nombre +" "+ apellido
        println(nombreCompleto)

        val añoNacimiento = 2000
        var añoActual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad=añoActual-añoNacimiento
        println("Edad = "+Edad)


        //tipos de datos
        var enteroExplicito:Int = 45
        println(enteroExplicito.javaClass)
        var enteroDeducido = 35
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido = 35.33
        println(dobleDeducido.javaClass)

        var flotanteExplicito:Float = 45.45F
        println(flotanteExplicito.javaClass)
        var flotanteDeducido = 35.35F
        println(flotanteDeducido.javaClass)

        var largoExplicito:Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido = 454545L
        println(largoDeducido.javaClass)

        var textoExplicito:String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido = "35"
        println(textoDeducido.javaClass)

        enteroExplicito=textoExplicito.toInt()
        println(enteroExplicito.javaClass)

        enteroDeducido=textoDeducido.toInt()
        println(enteroDeducido.javaClass)

      principal()
      mostrar(resRedondeo)
      datosPorConsola()

    }


  fun principal(){
    println("Hola Estuadiante desde la funcion principal!!!")

    saluda("Pedri","Santos")
    //retornaSaludo("Maria","Rivas")

    var saludo = retornaSaludo("pedro","Alberto")
    println(saludo)
  }

  fun saluda(nombre:String, apellido:String){
    println(nombre+" "+apellido)
  }

  fun retornaSaludo(nombre:String,apellido:String):String{
    return nombre+" "+apellido
  }





  var resSuma = suma(5.9,3.44F)
  var resRedondeo = redondeo(resSuma)

  fun suma(num1:Double,num2:Float):Double{
    var resultado = num1+num2
    println(resultado.javaClass)
    return  resultado
  }

  fun redondeo(num:Double):Double{
    var redondeo = Math.ceil(num)
    return redondeo
  }

  fun mostrar(num:Double){
    println(String.format("$%.2f",num))
  }


  fun datosPorConsola(){
    print("¿Estudiante como te llamas?")
    var nombre2= readLine()
    print("\n¿${nombre2} me podrias decir tu año de nacimiento: ")
    var añoNacimiento2= readLine()!!.toInt()
    var añoActual2=Calendar.getInstance().get(Calendar.YEAR)
    var edad2=añoActual2-añoNacimiento2
    print("\n${nombre2} ¿cuanto ganas?:")
    var salario2 = readLine()!!.toFloat()
    print("\nEstimado ${nombre2} a tus ${edad2} años, solo puedes ganar eso ${salario2}")
  }
}