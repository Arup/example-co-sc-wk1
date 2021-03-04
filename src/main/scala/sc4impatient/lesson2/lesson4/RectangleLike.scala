package sc4impatient.lesson2.lesson4

trait RectangleLike {
  def setFrame(x:Double, y:Double, w:Double, h:Double): Unit
  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def translate(dx:Double, dy:Double){setFrame(getX+dx,getY+dy,getWidth,getHeight)}


}
