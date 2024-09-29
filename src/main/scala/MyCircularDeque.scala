/*
https://leetcode.com/problems/design-circular-deque/description/?envType=daily-question&envId=2024-09-28

 */
class MyCircularDeque(_k: Int) {
  var deq = List[Int]()

  def insertFront(value: Int): Boolean = {
    if (deq.length < _k) {
      deq =  value +: deq
       true
    }  else {
      false
    }
  }

  def insertLast(value: Int): Boolean = {
    if (deq.length < _k) {
      deq = deq :+  value
      true
    }  else {
      false
    }
  }

  def deleteFront(): Boolean = {
    if (deq.isEmpty) false else { deq = deq.tail; true }
  }

  def deleteLast(): Boolean = {
    if (deq.isEmpty) false else { deq = deq.dropRight(1); true }
  }

  def getFront(): Int =  if(deq.isEmpty) -1  else deq.head

  def getRear(): Int = if (deq.isEmpty) -1 else deq.last

  def isEmpty(): Boolean = deq.isEmpty

  def isFull(): Boolean = deq.length == _k


}
