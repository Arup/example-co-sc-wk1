val x= -1

val res = if (x > 0) 1 else -1

val res2 = if (x>0) "posiyive" else -1


val res3= if(x>0) "some"

val rs = ()
if (x > 0) 1
if (x > 0) 1 else ()

var n =5
var r =6

if (n > 0) {
  r = r * n
  n -= 1
}


val b =while (n > 0) {

  r = r * n

  n -= 1

}


for (i <- 1 to n)
r = r * i

var sum = 0
for (ch <- "Hello") sum += ch


val n2 = 10
for(i<-1 to n2)println(i)

for (i <- 1 to 3; j <- 1 to 3 if i!=j ) print(f"${10 * i + j}%3d")

for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")

val vex=for (i <- 1 to 10) yield i % 3


def abs(x: Double) = if (x >= 0) x else -x


def fac2(n : Int) ={
  var r = 1
  for (i <- 1 to n) r = r * i
  r
}

def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

def box(s : String) { // Look carefully: no =

  val border = "-" * (s.length + 2)

  print(f"$border%n|$s|%n$border%n")

}

fac2(10)

def decorate(str: String, left: String = "[", right: String = "]") =

  left + str + right


decorate("Hello")

decorate("Hello", ">>>[")

decorate(left = "<<<", str = "Hello", right = ">>>")

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

val s = sum(1, 4, 9, 16, 25)


val s2 = sum(1 to 5: _*)

def recursiveSum(args: Int*) : Int = {

  if (args.length == 0) 0

  else args.head + recursiveSum(args.tail : _*)

}

def isVowel(ch:Char) = ch=='a' || ch=='b' || ch=='c' || ch=='d' || ch=='e'

isVowel('k')

'a'.to('e').map(isVowel(_))

def isVowel2(ch:Char)  = "aeiou".contains(ch)

isVowel2('k')

def vowels(s:String)={
  for(ch<-s if isVowel2(ch)) print(ch)
}

vowels("bizou")


def vowels2(s:String)=
for(ch<- s if isVowel(ch)) yield ch

vowels("Nicargua")

def vowelRecur(s:String):String ={
  if(s.length==0) ""
  else {
    val ch = s(0)
    val rest = vowelRecur(s.substring(1))
    if(isVowel(ch)) ch + rest else rest
  }

}
vowelRecur("Nicargua")

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


vowel5("Nicargua")


