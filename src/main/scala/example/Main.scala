package example

import math._

object Main extends App {
  //println(Lists.max(List(1,3,2)))
//  println(min(3,Pi))
//  println("bahello".sorted.apply(4))
//  val x = -4
//  val res = if(x>0) "something"
//
//  println(res)
  case class Person(firstName: String, lastName: String, age: Int)

  def filterAdult(persons: List[Person]) : List[Person] = persons.filter(_.age >= 18)

  val persons = List(
    Person(firstName = "Akira", lastName = "Sakura", age = 12),
    Person(firstName = "Peter", lastName = "Müller", age = 34),
    Person(firstName = "Nick", lastName = "Tagart", age = 52))

  val adults = filterAdult(persons)
 // val descriptions = adults.map(p => p.description).mkString("\n\t")
 // println(s"The adults are \n\t$descriptions")
}
