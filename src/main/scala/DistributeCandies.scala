/*
Problem https://leetcode.com/problems/distribute-candies/
 */

object DistributeCandies extends App {

  def distributeCandies(candyType: Array[Int]): Int = {
    val maxVariety: Int = candyType.length / 2
    if (candyType.distinct.length >= maxVariety) maxVariety else candyType.distinct.length
  }
}