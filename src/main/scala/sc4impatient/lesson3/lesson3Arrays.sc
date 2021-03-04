import scala.collection.mutable.ArrayBuffer

val a = new Array[Int](10)
for(i <- 0 until a.length) a(i) = i*i
a

for (elem<-a) println(elem)



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

val b = ArrayBuffer(1, 7, 2, 9)

val matrix = Array.ofDim[Int](4,4)


val triangle = new Array[Array[Int]](10)

for (i <- triangle.indices)
triangle(i) = new Array[Int](i + 1)


import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer

val command = ArrayBuffer("ls", "-al", "/home/cay")
val pb = new ProcessBuilder(command) // Scala to Java


val t = (1, 3.14, "Fred")

t._2
t._1

val (_, second, third) =t



import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._ // Import keys for map below

val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map

val font = new java.awt.Font(attrs) // Expects a Java map

val poem = "Mary had a little lamb Its fleece was white as snow And everywhere that Mary went The lamb was sure to go It followed her to school one day Which was against the rule It made the children laugh and play To see a lamb at school And so the teacher turned it out But still it lingered near And waited patiently about Till Mary did appear Why does the lamb love Mary so The eager children cry Why Mary loves the lamb, you know The teacher did reply"

val words = poem.split(" ")

words.groupBy(_.substring(0,1))

words.groupBy(_.length())


val spark = SparkSession.builder()
  .appName("SparkByExamples.com")
  .master("local")
  .getOrCreate()