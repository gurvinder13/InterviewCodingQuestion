package com.example.interviewcodingquestion.linkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        /*Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        ll.head = p1;*/

        ll.addToLast(10);
        ll.addToLast(20);
        ll.addToLast(30);
        ll.addToLast(40);
        ll.addToFirst(5);
        int [] arr= {1,2,4,5};
        ll.addAll(arr);
        ll.addMiddle(15, 3);
        ll.removeLast();
        ll.printLinkedList();


    }
}

class LinkedList {
    Node1 head;

    void printLinkedList() {
        Node1 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    /**
     * Adding element to the last
     *
     * @param e element of the linked list
     */
    void addToLast(int e) {
        Node1 temp = new Node1(e);
        if (head == null) {
            head = temp;
        } else {
            Node1 curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    /**
     * Adding element to the first
     *
     * @param e element of the linked list
     */
    void addToFirst(int e) {
        Node1 temp = new Node1(e);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    /**
     * Add all elements
     */

    void addAll(int [] elements ){
        for (int e : elements){
            addToLast(e);
        }
    }

    /**
     * Adding element to the middle of the list or specific index
     *
     * @param element element of the linked list
     */

    void addMiddle(int element, int index) {
        if (index == 0) {
            addToFirst(element);
        } else {
            Node1 temp = new Node1(element);
            int count = 0;
            Node1 curr = this.head;
            while (count < index - 1) {
                curr = curr.next;
                count++;
            }
            temp.next = curr.next;
            curr.next = temp;
        }

    }

    /**
     * Remove last element from list
     */

    void removeLast(){
        if (head == null){
            System.out.println("Empty List, nothing to delete");
        } else if (head.next == null) {
              head = null;
        } else if (head.next != null) {
         Node1 curr = head;
         while (curr.next.next!=null){
             curr = curr.next;
         }
         curr.next = null;
        }
    }

}

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
