/*
https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
 */

class KthCharInGame {
  val s: String = generateNTimes(10)
  def getStringByNextChars(s: String): String = s.map(c => if (c == 'z') 'a' else (c + 1).toChar)
  def generateString(s: String): String = s + getStringByNextChars(s)
  def generateNTimes(n: Int, s: String = "a", current: Int = 1): String = if (current >= n) s else generateNTimes(n, generateString(s), current + 1)
  def kthCharacter(k: Int): Char = s.charAt(k - 1)
}
