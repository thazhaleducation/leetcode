import org.scalatest.funsuite.AnyFunSuite

class KthCharInGameSpec extends AnyFunSuite{
  val kthCharInGame = new KthCharInGame
  test("getStringByNextChars") {
    val kthCharInGame = new KthCharInGame
    assert(kthCharInGame.getStringByNextChars("a") == "b")
    assert(kthCharInGame.getStringByNextChars("ab") == "bc")
    assert(kthCharInGame.getStringByNextChars("abc") == "bcd")
//    assert(kthCharInGame.generateNTimes(10) == "A")
//    assert("abbcbccdbccdcddebccdcddecddedeefbccdcddecddedeefcddedeefdeefeffgbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghbccdcddecddedeefcddedeefdeefeffgcddedeefdeefeffgdeefeffgeffgfgghcddedeefdeefeffgdeefeffgeffgfgghdeefeffgeffgfggheffgfgghfgghghhi".length == 2)
  }

  test("kthchar") {
    assert(kthCharInGame.kthCharacter(5) == 'b')
    assert(kthCharInGame.kthCharacter(10) == 'c')
  }

}
