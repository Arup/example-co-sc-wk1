package example

case class Point (x: Double = 0.0, y:Double = 0.0)

abstract class Shape()

case class Circle(center: Point, radius: Double) extends Shape