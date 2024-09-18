/*
* Problem: https://leetcode.com/problems/largest-number/
* */
object Solution extends App {
  def getMax(n1: String, n2: String): Int = (n1, n2) match {
    case (n1, n2) if (n1 + n2) > (n2 + n1) => n1.toInt
    case _ => n2.toInt
  }
  // state 
  def findNextPossibleNum(nums: Array[String], pos: Int): String = {
    nums.max()
  }
  // def removeFromNums(takenNum: String, nums: Array[String]): Array[String] = nums.

  // def largestNumber(nums: Array[Int]): String = {
  //   nums.map(_.toString).sorted.reverse.mkString
  //     // ""
  // }

  // println(largestNumber(Array(3,30,34,5,9)))
  // println(largestNumber(Array(3,30)))
  // println(largestNumber(Array(3,30,34,5,9)) == "9534330")
  // println(largestNumber(Array(10,2)) == "210")
  println(findNextPossibleNum(Array(3, 31, 30).map(_.toString), 0))
}