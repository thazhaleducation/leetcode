import org.scalatest.funsuite.AnyFunSuite

class RankTransformSpec extends AnyFunSuite {
  test("rank transform") {
    val r = new RankTransform()
    assert(r.arrayRankTransform(Array(40, 10, 20, 30)) sameElements Array(4, 1, 2, 3))
    assert(r.arrayRankTransform(Array(37,12,28,9,100,56,80,5,12)) sameElements Array(5,3,4,2,8,6,7,1,3))
    assert(r.arrayRankTransform(Array(100,100,100)) sameElements Array(1,1,1))
  }

}
