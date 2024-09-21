import org.scalatest.funsuite.AnyFunSuite


class WaysToAddParanthesesSpec extends AnyFunSuite {
  test("combinations for single operation") {
    assert(WaysToAddParantheses.diffWaysToCompute("2*3") == List(6))
    assert(WaysToAddParantheses.diffWaysToCompute("20*3") == List(60))
    assert(WaysToAddParantheses.diffWaysToCompute("200*30") == List(6000))
    assert(WaysToAddParantheses.diffWaysToCompute("2-1-1").sorted == List(0,2))
    assert(WaysToAddParantheses.diffWaysToCompute("2*3-4*5").sorted == List(-34,-14,-10,-10,10))

  }

  test("operator indices") {
    assert(WaysToAddParantheses.getOperatorIndices("2*3") == List(1))
    assert(WaysToAddParantheses.getOperatorIndices("200*33") == List(3))
    assert(WaysToAddParantheses.getOperatorIndices("2*3-4") == List(1,3))
    assert(WaysToAddParantheses.getOperatorIndices("2*3-4*5") == List(1,3,5))
  }
}
