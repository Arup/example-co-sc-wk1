package example


import java.util.Arrays
import java.util.HashMap
import java.util.Map

object SelectionSort {

  def selectionSort(input: Array[Int]): Array[Int] = {
    var inVal: Map[Integer, Integer] = new HashMap[Integer, Integer]()
    for (count <- 0 until input.length) {
      inVal = findMin(input, count)
      val indx: Int = inVal.keySet.iterator().next()
      val temp: Int = input(count)
      input(count) = inVal.get(indx).toInt
      input(indx) = temp
    }
    input
  }

  def findMin(input: Array[Int], pos: Int): Map[Integer, Integer] = {
    val min: Map[Integer, Integer] = new HashMap[Integer, Integer]()
    var mi: Int = input(pos)
    var mindex: Int = pos
    for (i <- pos until input.length if input(i) < mi) {
      if (min.isEmpty) min.put(i, input(i))
      else {
        min.remove(mindex)
        min.put(i, input(i))
      }
      mi = input(i)
      mindex = i
    }
    if (min.isEmpty) min.put(pos, mi)
    min
  }

  def findMinFun(input: Array[Int]): Int = Arrays.stream(input).min().getAsInt

  def main(args: Array[String]): Unit = {
    var input: Array[Int] = Array(3, 2, 1)
    input = selectionSort(input)
    //Arrays.stream(input).forEach(println)
  }

}
