/*
https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/description/
 */
object DivisibleArrayPairs {
  private def increaseFreq(freq: Map[Int, Int], i: Int): Map[Int, Int] = freq + (i -> (freq.getOrElse(i, 0) + 1))

  def getFrequenciesOfReminders(arr: Array[Int], k: Int): Map[Int, Int] = {
    arr.foldLeft(Map[Int, Int]())((freq, x) => increaseFreq(freq, ((x % k) + k) % k))
  }

  def canArrange(arr: Array[Int], k: Int): Boolean = {
    val freq = getFrequenciesOfReminders(arr, k)
    if (freq.view.filterKeys(i => i != 0).nonEmpty) {
      freq.getOrElse(0, 0) % 2 == 0 && (freq.view.filterKeys(i => i != 0).keys forall (i => freq.contains(i) && freq.contains(k - i) && freq(i) == freq(k - i)))
    } else {
      freq.getOrElse(0, 0) % 2 == 0
    }
  }
}
