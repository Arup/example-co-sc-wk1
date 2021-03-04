import scala.collection.immutable.HashSet

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2)
  print(greetStrings(i))

val numNames = Array("zero", "one", "two")

val numNames2 = Array.apply("zero", "one", "two")

val oneTwoThree = List(1, 2, 3)

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(""+ oneTwo +" and "+ threeFour +" were not mutated.")
println("Thus, "+ oneTwoThreeFour +" is a new list.")

val twoThree = List(2, 3)
val oneT24 = 1 :: twoThree
println(oneT24)


val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))


val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")



var treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))