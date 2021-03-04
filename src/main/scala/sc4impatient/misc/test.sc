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

val x =1+1

val y: Int = 1+1

for (i <- Array(1,2,3)) println(i)

for (i<- Array(1,2,3)) yield i*2

val nums = List(1,2,3,4,5).filter(_ < 4)

var nums2 = List(1,2,3,4,5).filter(_ < 4).map(_ * 2)

"hello world".split(' ')