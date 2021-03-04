import example.Lists._

import scala.math.sqrt

max(List(1,3,2))

"Hello".apply(4)

10 max 2

1.to(10).map(sqrt(_))

"Mississippi".distinct

"Rhine".permutations.toArray

//"ABC".sum
//
//('A' + 'B' + 'C').toChar

//val x = -4
//val res = if(x>0) "something"
//val result = ()
//var n=5
//for(i<-1 to n) println(i)
//
//for(c<-"Hello") println(c)
//
//for(i<-1 to 3; j <-1 to 3) print ((10*i + j)+" ")
//
//for (i <- 1 to 10) yield i % 3
//
//var sum = 0
//
//for (ch <- "Hello") sum +=ch
//println(sum)
//
//for(i<-1 to 3; j <-1 to 3 if i!=j) print ((10*i + j)+" ")


//def abs(x:Double) = if (x>0) x else -x
//
//println(abs(3))
//println(abs(-3))
//
//def fac(n: Int): Int = if (n<=0) 1 else n*fac(n-1)
//
//
//def box(s:String){
//val border = "-" + s.length + "---\n"
//  println(border+"|"+s+"\n"+border)
//}
//
//box("Hello6 ")

def sum(args:Int*)={
  var res = 0
  for (arg <- args) res += arg
  res
}

println(sum(1,4,9,16,25))
println()

def isVowel(ch:Char)  = "aeiou".contains(ch)

println(isVowel('v'))

def vowel1(s:String) = {
  var result = ""
  for (ch <-s){
    if(isVowel(ch)) result+=ch
  }
  result
}

def vowel2(s:String)=
  for(ch<-s if isVowel(ch)) yield ch


def vowel3(str:String) ={
  for(s<- str if isVowel(s)) println(s)
}

def vowel4(s:String):String = {
  var result = ""
  if (s.length == 0) ""
  else {
    val ch = s(0)
    val rest = vowel4(s.substring(1))
    if(isVowel(ch)) ch + rest else rest
  }

}

def vowel5(s:String) = {
  var result = ""
  var count = 0
  while(count<s.length){
    if(isVowel(s.charAt(count)))
      result += s.charAt(count)
    count +=1
  }
  result
}

vowel4("Nicaraguagerman")

class Point(var x:Double, val y:Double){
  println(f"Welcome to(${x},${y}")

  def move(dx:Double, dy:Double) = new Point(x+dx, y+dy)
  def distFrmOrig = math.sqrt(x*x + y*y)

  override def toString = f"(${x},${y}"
}

val p = new Point(3,4)

p.move(10,20)

p.x
p.y

p.x =13

object Accounts {

  private var lastNumber = 0

  def newUniqueNumber() = { lastNumber += 1; lastNumber }

}


Accounts
Accounts.newUniqueNumber()
Accounts.newUniqueNumber()


object part1{
  println("wwek")

  class Time(h:Int, m:Int){
    private val minSinceMidnight = h*60 + m
    def hours = minSinceMidnight/60
    def minutes = minSinceMidnight % 60
    override def toString = f"${hours}:${minutes}%02d"

  }

  val morning = new Time(9,0)
}

part1.morning
part1.morning.hours