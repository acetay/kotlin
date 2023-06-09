package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age : Int = 0
) {

    var email : String = ""
    var nameLength: Int = 0
    init {
        println("inside init block")
        nameLength = name.length
    }

    constructor(
        _email : String,
        _name: String = "",
        _age: Int = 0
    ) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
   /* val person = Person("ace", 37)
    person.action()
    println("Name : ${person.name} and the age is ${person.age}")

    val person1 = Person()
    println("Name : ${person1.name} and the age is ${person1.age}")*/

    val person2 = Person(_email = "ace@gmail.com", "ace", 37)
    println("Name : ${person2.name} and the age is ${person2.age} and email is " +
            "${person2.email} + name length is ${person2.nameLength}")
}