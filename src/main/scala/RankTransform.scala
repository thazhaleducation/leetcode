/*
https://leetcode.com/problems/rank-transform-of-an-array/
 */


class RankTransform {
  def arrayRankTransform(arr: Array[Int]): Array[Int] = {
    val rank: Map[Int, Int] = arr.distinct.sortInPlace().zipWithIndex.toMap
    arr.map(a => rank(a) + 1)
  }
}
