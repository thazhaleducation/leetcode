import org.scalatest.funsuite.AnyFunSuite

class LargestNumberSpec extends AnyFunSuite {
  test("NumAsStr comparison") {
    assert(NumAsStr("3") < NumAsStr("34"))
    assert(NumAsStr("30") < NumAsStr("34"))
    assert(NumAsStr("3") == NumAsStr("3"))
    assert(NumAsStr("31") < NumAsStr("3"))
    assert(NumAsStr("30") < NumAsStr("3"))
    assert(NumAsStr("35") < NumAsStr("9"))
    assert(NumAsStr("999") < NumAsStr("19"))
  }

  test("span") {
//    assert(List("10" ,"2").map(NumAsStr).sorted == List("2", "10").map(NumAsStr))
    assert(LargestNumber.largestNumber(Array(3,30,34,5,9)) == "9534330")
    assert(LargestNumber.largestNumber(Array(1,2,3,4,5,6,7,8,9,0)) == "9876543210")
    assert(LargestNumber.largestNumber(Array(0,0)) == "0")
    assert(LargestNumber.largestNumber(Array(1,0,0)) == "100")
//    assert(List("30", "34" , "3").sortWith((n1, n2) => LargestNumber.getMax(n1, n2)).reverse == List("34", "3", "30"))
  }

}
