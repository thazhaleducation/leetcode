import org.scalatest.funsuite.AnyFunSuite

class CustomStackSpec extends AnyFunSuite {
  test("test custom stack") {
      val stk = new CustomStack(3)
    stk.push(1);                          // stack becomes [1]
    stk.push(2);                          // stack becomes [1, 2]
    assert(stk.pop() == 2)                            // return 2 --> Return top of the stack 2, stack becomes [1]
    stk.push(2);                          // stack becomes [1, 2]
    stk.push(3);                          // stack becomes [1, 2, 3]
    stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4
    stk.increment(5, 100);                // stack becomes [101, 102, 103]
    stk.increment(2, 100);                // stack becomes [201, 202, 103]
    assert(stk.pop() == 103)                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
    assert(stk.pop() == 202)                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
    assert(stk.pop() == 201)                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
    assert(stk.pop() == -1)                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
  }

}
