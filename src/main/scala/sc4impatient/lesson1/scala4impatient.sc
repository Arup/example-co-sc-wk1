object Sheet1{
  println("Welcome")

  val ans = 8*5+2
  ans * 0.5
  ("Hello,"+ans).toLowerCase()

  val a = 6*7

  val b: BigInt = 6*7

  b.pow(1000)
}

var s = Sheet1

s.ans
s.b


val c: BigInt =2

c.pow(1024)

import scala.math._

sqrt(10)*sqrt(10)

1.to(10)

1.to(10).map((sqrt(_)))

6.*(7)


val s1:String = "mississippi"

s1.distinct

s1.permutations.toArray

//"Rhine".permutations.toArray

"ABC".sum

('A'+'B'+'C').toChar

'Æ'.toDouble


object StringUtilV1 {
  def joiner(strings: String*): String = strings.mkString("-")

  def joiner(strings: List[String]):String = joiner(strings :_*)   // COMPILATION ERROR
}

println( StringUtilV1.joiner(List("Programming", "Scala")) )


def isEven(n: Int) = (n % 2) == 0

List(1, 2, 3, 4) filter isEven foreach println