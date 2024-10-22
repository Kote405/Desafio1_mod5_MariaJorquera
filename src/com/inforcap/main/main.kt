package com.inforcap.main

fun main () {
    val autor1 = autor(
        Nombre = "Howard Phillippe",
        Apellido = "Lovecraft",
        Year_of_birth = 1890,
        Year_of_death = 1937,
        Obras_destacadas = listOf("La Llamada de Cthululu", "El Necronomicon", "Las Montañas de la Locura"),
        Comentario = "Escritor EE.UU de Novelas de terror y ciencia ficcion",
        Edad = null
    )
    val autor2 = autor(
        Nombre = "Stephen",
        Apellido = "King",
        Year_of_birth = 1947,
        Year_of_death = null,
        Obras_destacadas = listOf("El Resplandor", "El Doctor Sueño", "The Green Mile"),
        Comentario = "Autor Americano apodado el Rey del Terror",
        Edad = null
    )

    var autores: ArrayList<autor> = ArrayList()
    autores.add(autor1)
    autores.add(autor2)


    for (a in autores) {
        println(a)
    }
}

//fun resumenDetalles(autor: autor){
  //  println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")


  //  var Edad = calculoEdad(autor1.Year_of_death,autor1.Year_of_birth)

    //}


