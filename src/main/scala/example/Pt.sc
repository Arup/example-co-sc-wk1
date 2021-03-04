

  println("eelcom")

  class Point(val x:Double, val y:Double){
    def move(dx: Double, dy: Double) = new Point(x+dx,y+dy)
    def distanceFromOrigin = math.sqrt(x*x+y*y)

    override def toString: String = f"(${x},${y})"
  }

  val p = new Point(3,4)
  p.move(10,20)

  p.distanceFromOrigin

  p.x
  p.y



  class Counter {

    private var value = 0 // You must initialize the field

    def increment() { value += 1 } // Methods are public by default

    def current() = value

  }


  val myCounter = new Counter // Or new Counter()
  val myCounter2 = new Counter // Or new Counter()
  myCounter.increment()
  myCounter2.increment()
  myCounter2.increment()
  myCounter.increment()

  println(myCounter.current)
  println(myCounter2.current)