/*
* Problem: https://leetcode.com/problems/different-ways-to-add-parentheses/?envType=daily-question&envId=2024-09-19
*
* */

object WaysToAddParantheses {

  def getOperatorIndices(exp: String): IndexedSeq[Int] = for(
    i <- exp.indices if List('+', '-', '*').contains(exp.charAt(i))
  ) yield i

  def diffWaysToCompute(exp: String): List[Int] = {
    if (getOperatorIndices(exp).isEmpty) List(exp.toInt) else {

      getOperatorIndices(exp).toList.flatMap(index => {
        val split = exp.splitAt(index)
        val left = diffWaysToCompute(split._1)
        val right = diffWaysToCompute(split._2.tail)
        val operator = exp.charAt(index)
        (for( i <- left; j <- right) yield (i, j)).map((z) => {
          operator match {
            case '+' => z._1 + z._2
            case '-' => z._1 - z._2
            case '*' => z._1 * z._2
          }
        })
      })
    }
  }
}
