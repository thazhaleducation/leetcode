import org.scalatest.funsuite.AnyFunSuite

class DivisibleArrayPairsSpec extends AnyFunSuite {

  test("test freq") {
    assert(DivisibleArrayPairs.getFrequenciesOfReminders(Array(-10, 10), 2) == Map(0 -> 2))
  }

  test("test canArrange") {
    assert(DivisibleArrayPairs.canArrange(Array(1, 2, 3, 4, 5, 10, 6, 7, 8, 9), 5))
    assert(DivisibleArrayPairs.canArrange(Array(1, 2, 3, 4, 5, 6), 7))
    assert(!DivisibleArrayPairs.canArrange(Array(1, 2, 3, 4, 5, 6), 10))
    assert(DivisibleArrayPairs.canArrange(Array(-1,1,-2,2,-3,3,-4,4), 3))
    assert(DivisibleArrayPairs.canArrange(Array(-10, 10), 2))
    assert(DivisibleArrayPairs.canArrange(Array(3,8,7,2), 10))
  }

}
