import org.scalatest.funsuite.AnyFunSuite

class AllOneSpec extends AnyFunSuite {
  test("test inc") {

    val allOne = new AllOne()
    allOne.inc("a")
    allOne.inc("b")
    allOne.inc("b")
    allOne.inc("c")
    allOne.inc("c")
    allOne.inc("c")
    allOne.dec("b")
    allOne.dec("b")
    assert(allOne.getMinKey() == "a")
    allOne.dec("a")
    assert(allOne.getMaxKey() == "c")
    assert(allOne.getMinKey() == "c")

  }

  test("empty") {
    val allOne = new AllOne
    assert(allOne.getMaxKey() == "")
    assert(allOne.getMinKey() == "")
  }

}
