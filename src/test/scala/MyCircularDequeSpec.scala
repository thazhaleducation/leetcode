import org.scalatest.funsuite.AnyFunSuite

class MyCircularDequeSpec extends AnyFunSuite {
  test("test array") {
    val arr = Array.fill[Int](3)(-1)
    assert(arr(0) == 1)
  }

  test("MyCircularDeque") {
    val myCircularDeque = new MyCircularDeque(3)
    assert(myCircularDeque.insertLast(1)) // return True

    assert(myCircularDeque.insertLast(2)) // return True

    assert(myCircularDeque.insertFront(3)) // return True

    assert(myCircularDeque.insertFront(4) == false) // return False, the queue is full.

    assert(myCircularDeque.getRear == 2) // return 2

    assert(myCircularDeque.isFull) // return True

   assert( myCircularDeque.deleteLast )// return True

    assert(myCircularDeque.insertFront(4)) // return True

    assert(myCircularDeque.getFront == 4) // return 4

  }

}
