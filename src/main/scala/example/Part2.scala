package example

import java.util.Scanner

import scala.collection.SortedMap
import scala.collection.mutable.ArrayBuffer



object Part2 extends App {

  println("Welcome to the scala worksheet")

  val in = new Scanner(new java.net.URL("http://www.gutenberg.org/files/11/11-0.txt").openStream)

  val count = scala.collection.mutable.Map[String, Int]()

  while(in.hasNext()){
    val word = in.next()
    count(word) = count.getOrElse(word,0) + 1
  }

  println(count("Alice"))
  println(count("Rabbit"))


  var z = Array("Zara", "Nuha", "Ayan")
  z.groupBy(_.substring(0,1))

  val buf = ArrayBuffer(1,2,-3,4,-5,6,-7,-8)

  println(buf.partition(_ < 0))

  val m1 = SortedMap("geeks" -> 5, "for" -> 3, "cs" -> 2)

  // Make a SortedMap via the companion object factory
  val weekdays = SortedMap(
    2 -> "Monday",
    3 -> "Tuesday",
    4 -> "Wednesday",
    5 -> "Thursday",
    6 -> "Friday"
  )

  val days = weekdays ++ List(1 -> "Sunday", 7 -> "Saturday")

  val day3 = days.get(3)



}
