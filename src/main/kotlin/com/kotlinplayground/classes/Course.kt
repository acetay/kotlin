package com.kotlinplayground.classes

data class Course(
    val id : Int,
    val name : String,
    val author: String
)

fun main() {

    val course = Course(1, "Reactive Programming", "Dilip")
    //println(course)

    val course1 = Course(1, "Reactive Programming", "Dilip")

    println("Check Object Equality : ${course == course1}")

    val course3 = course1.copy(
        id =  3, author =  "Dilip1"
    )
    println(course3)
}