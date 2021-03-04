class Time(val hours:Int,val mins:Int){
  if(hours<0 || hours>=24 || mins<0 || mins >=60) throw new IllegalArgumentException

  def before(other:Time) = hours < other.hours

  override def toString: String = f"{hours}:{minutes}"

}

val morning = new Time(9,0)
val afternoon = new Time(16,30)
morning.before(afternoon)

trait Logged{
  def log(msg: String){}
}

trait ConsoleLoger extends Logged{
  override def log(msg: String){println(msg)}
}

class SavingsAcc extends Logged {
  var bal: Double = 0
  def withdrew(amt: Double): Unit ={
    if (amt>bal) log ("Insuff balance")
    else bal -=amt
  }
}

val acc = new SavingsAcc with ConsoleLoger

acc.withdrew(1000)

class Person(val name: String) {

  def description = ???

}


import java.awt._
val r = new Rectangle(5,10,20,30)
r.translate(10,20)
r

import java.awt.geom._
//val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike


