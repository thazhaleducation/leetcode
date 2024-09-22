import org.scalatest.funsuite.AnyFunSuite

class LexicographicalNumbersSpec extends AnyFunSuite {


  test("lexicalOrder") {
    assert(LexicographicalNumbers.lexicalOrder(2) == List(1, 2))
    assert(LexicographicalNumbers.lexicalOrder(13) == List(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9))
    assert(LexicographicalNumbers.lexicalOrder(23) == List( 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 3, 4, 5, 6, 7, 8, 9))
    assert(LexicographicalNumbers.lexicalOrder(33) == List( 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 3, 30, 31, 32, 33, 4, 5, 6, 7, 8, 9))
  }
}
