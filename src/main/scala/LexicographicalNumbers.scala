/*
* https://leetcode.com/problems/lexicographical-numbers/?envType=daily-question&envId=2024-09-21
* */
object LexicographicalNumbers
{
  private def digits(start: Int = 0): List[Int] = start match {
    case start if start < 10 => (1 to (9 - start)).toList
    case _ => (0 to 9).toList
  }

  private def generateNums(n: Int, start: Int = 0): List[Int] = {
    start match {
      case start if start <= n => start :: digits(start * 10).collect {
        case i if ((start*10) + i) <= n =>  generateNums(n, (start*10) + i)
      }.flatten
      case start if start > n => Nil
    }
  }

  def lexicalOrder(n: Int): List[Int] = generateNums(n).tail
}
