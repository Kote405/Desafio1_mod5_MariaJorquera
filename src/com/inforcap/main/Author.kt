package com.inforcap.main

data class autor(
    val Nombre : String,
    val Apellido : String,
    val Year_of_birth : Int,
    val Year_of_death : Int?,
    val Obras_destacadas : List<String>,
    val Comentario : String,
    var Edad : Int?
)

//fun calculoEdad(Year_of_death: Int?,Year_of_birth: Int):Int{
  //  return if (Year_of_death == null){
    //    -1
   // }
    //else {
      //  Year_of_death - Year_of_birth
    //}
//}


