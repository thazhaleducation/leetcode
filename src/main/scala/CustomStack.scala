/*
https://leetcode.com/problems/design-a-stack-with-increment-operation/solutions/?envType=daily-question&envId=2024-09-30
 */
class CustomStack(_maxSize: Int) {
  var arr: Array[Int] = Array.empty

  def push(x: Int): Unit = {
    if (arr.length < _maxSize) {
      arr = arr :+ x
    }
  }

  def pop(): Int = {
    if (arr.isEmpty) return -1

    val top = arr.last
    arr = arr.dropRight(1)
    top
  }

  def increment(k: Int, `val`: Int): Unit = {
    val splits = arr.splitAt(k)
    arr = splits._1.map(i => i + `val`) ++ splits._2
  }

}
