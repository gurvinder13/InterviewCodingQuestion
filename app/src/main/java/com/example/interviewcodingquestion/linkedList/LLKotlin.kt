package com.example.interviewcodingquestion.linkedList


class LLL {
    private val size = 0

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Try programiz.pro")
            val ll = LinkedList11()
            /* Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
       ll.head = p1;*/ll.add(10)
            ll.add(20)
            ll.add(30)
            ll.add(40)
            ll.addFirst(5)
            ll.printLinkedList()
            ll.addMidle(15, 3)
            ll.printLinkedList()
            ll.removeLast()
            ll.printLinkedList()
            val arr = intArrayOf(1, 2, 3)
            ll.addAll(arr)
            ll.printLinkedList()
            ll.removeFirst()
            ll.printLinkedList()
            println("Size of the linkedList is :- " + ll.size)
            ll.reverseLL()
            ll.printLinkedList()
        }
    }
}


internal class LinkedList11 {
    var head: NodeK? = null
    fun printLinkedList() {
        var curr = head
        while (curr != null) {
            print(curr.data.toString() + " --> ")
            curr = curr.next
        }
        print(" null")
        println()
    }

    fun add(e: Int) {
        val temp = NodeK(e)
        if (head == null) {
            head = temp
        } else {
            var curr = head
            while (curr!!.next != null) {
                curr = curr.next
            }
            curr.next = temp
        }
    }

    fun addFirst(e: Int) {
        val temp = NodeK(e)
        if (head == null) {
            head = temp
        } else {
            temp.next = head
            head = temp
        }
    }

    fun addAll(elements: IntArray) {
        for (e in elements) add(e)
    }

    fun addMidle(e: Int, index: Int) {
        if (index == 0) {
            addFirst(e)
        } else {
            val temp = NodeK(e)
            var count = 0
            var curr = head
            while (count < index - 1) {
                curr = curr!!.next
                count++
            }
            temp.next = curr!!.next
            curr.next = temp
        }
    }

    fun removeFirst() {
        if (head == null) {
            println("Empty List, nothing to delete")
            return
        } else if (head!!.next == null) {
            head = null
        } else if (head!!.next != null) {
            val curr: NodeK = this.head!!
            head = head!!.next
            curr.next = null
        }
    }

    fun removeLast() {
        if (head == null) {
            print(" list is empty")
        } else if (head!!.next == null) {
            head = null
        } else {
            var curr = head
            while (curr!!.next!!.next != null) {
                curr = curr.next
            }
            curr.next = null
        }
    }

    val size: Int
        get() {
            var curr = head
            var count = 0
            while (curr != null) {
                curr = curr.next
                count++
            }
            return count
        }

    /**
     * reverse LL
     * Iterative Method
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    fun reverseLL() {
        if (head == null || head!!.next == null) {
            return
        }
        var preNodeK: NodeK = head as NodeK
        var curr = head!!.next
        while (curr != null) {
            val next = curr.next!!
            curr.next = preNodeK
            preNodeK = curr
            curr = next
        }
        head!!.next = null
        head = preNodeK
    }
}


internal class NodeK
    (var data: Int) {
    var next: NodeK? = null
}
