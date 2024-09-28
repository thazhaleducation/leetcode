import org.scalatest.funsuite.AnyFunSuite

class DistributeCandiesSpec extends AnyFunSuite {
  test("find distinct") {
    assert(DistributeCandies.distributeCandies(Array(1,1,2,3)) == 2)
    assert(DistributeCandies.distributeCandies(Array(6,6,6,6)) == 1)
    assert(DistributeCandies.distributeCandies(Array(1,1,2,2,3,3)) == 3)
  }
}