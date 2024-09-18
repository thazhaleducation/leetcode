/*
* Problem: https://leetcode.com/problems/largest-number/
* */

case class NumAsStr(val num: String) extends Ordered[NumAsStr] {
  override def compare(that: NumAsStr): Int = (num + that) compareTo (that + num)
}

object LargestNumber extends App {

  def lt(n1: String, n2: String): Boolean = (n1 + n2) < (n2 + n1)
  def largestNumber(nums: Array[Int]): String = {
    val cleanedNum = if (nums.exists(_ != 0)) nums else nums.filter(_ != 0) :+ 0
    cleanedNum.map(_.toString).sortWith((n1, n2) => lt(n1, n2)).reverse.mkString("") match {
      case "" => "0"
      case (x:String) => x
    }
  }

  // println(largestNumber(Array(3,30,34,5,9)))
  // println(largestNumber(Array(3,30)))
  // println(largestNumber(Array(3,30,34,5,9)) == "9534330")
  // println(largestNumber(Array(10,2)) == "210"
}
