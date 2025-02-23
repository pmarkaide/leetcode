/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// 23/02/2025
fun createList(): ListNode {
    val head = ListNode(1)
    var current = head

    for (i in 2..6) {
        current.next = ListNode(i)
        current = current.next!!
    }
    return head
}

fun middleNode(head: ListNode?): ListNode? {
    // Count nodes
    var count = 0
    var current = head
    while(current != null) {
        count++
        current = current.next
    }

    val middlePosition = count / 2

    current = head
    for(i in 0 until middlePosition) {
        current = current?.next
    }

    return current
}


fun main(){
    val list = createList()
    println(list.`val`)
    val next = middleNode(list)
    println(next?.`val`)
}