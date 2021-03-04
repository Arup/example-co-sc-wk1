val √ = scala.math.sqrt _
√(2)

val `val` = 42
println(`val`)

1 .->(10)
import scala.math._
val fun = ceil _

fun(3.14)

(x: Double) => 3 * x

val triple = (x: Double) => 3 * x
def triple(x: Double) = 3 * x


Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)


def mulBy(factor : Double) = (x : Double) => factor * x

val quintuple = mulBy(5)

quintuple(20) // 100

//valueAtOneQuarter((x: Double) => 3 * x)
//
//valueAtOneQuarter((x) => 3 * x)

val fun4 = 3 * _ // Error: Can't infer types

val fun2 = 3 * (_: Double) // OK

val fun3: (Double) => Double = 3 * _ // OK because

(1 to 9).reduceLeft(_ * _)

val triple2 = mulBy(3)

val half = mulBy(0.5)

val mul = (x: Int, y: Int) => x * y
val mulOneAtATime = (x: Int) => ((y: Int) => x * y)



