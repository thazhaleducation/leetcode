import java.util
import scala.collection.mutable

/*
https://leetcode.com/problems/all-oone-data-structure/
 */

class AllOne() {

  var map: Map[String, Int] = Map.empty

  implicit val ord: Ordering[(String, Int)] = (x: (String, Int), y: (String, Int)) => x._2 compare y._2

  def inc(key: String): Unit = map = map + (key -> (map.getOrElse(key, 0) + 1))

  def dec(key: String): Unit = if (map(key) == 1) map = map.filter(p => p._1 != key) else map = map + (key -> (map(key) - 1))
  def getMaxKey(): String = if( map.isEmpty) "" else map.max._1
  def getMinKey(): String =  if(map.isEmpty) "" else  map.min._1

}
