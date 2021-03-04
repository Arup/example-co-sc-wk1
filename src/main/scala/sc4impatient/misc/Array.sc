import scala.collection.mutable.ArrayBuffer

val a = new Array[Int](10)

for(i <- 0 until a.length) a(i) = i*i
println(a)

for (elem <- a) println(elem)

val b = ArrayBuffer[Int] ()

b+=1

b+=(1,2,3,5)

b ++= Array(8,13,21)

b.trimEnd(5)

b.insert(2,6)

b.toArray

println(b)

val c = Array(2, 3, 5, 7, 11)

val result = for (elem <- c) yield 2 * elem

val result2 = for (elem <- a if elem%2!=0) yield elem




val scores = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

var bobScore = scores("Bob")

scores.getOrElse("Fred",0 )

var mscores = scala.collection.mutable.Map("Alice" ->10)

mscores("Bob") = 7

mscores += (("Bob", 3), ("Fred", 8))

mscores = mscores + (("Bob", 3), ("Fred", 8))

for((k,v) <- scores)
  yield(k,v)

val t = (1, 3.14, "Fred")

t._2
t._1

val (_, second, third) =t

var z = Array("Zara", "Nuha", "Ayan")
z.groupBy(_.substring(0,1))

z.groupBy(_.length)

"New York".partition(_.isUpper)

val symbols = Array("<","-",">")

val counts = Array(2,10,2)

val pairs = symbols.zip(counts)

