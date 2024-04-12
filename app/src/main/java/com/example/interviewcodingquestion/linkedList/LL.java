package com.example.interviewcodingquestion.linkedList;

public class LL {
    private int size;
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        LinkedList1 ll = new LinkedList1();
        /* Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
       ll.head = p1;*/
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(5);
        ll.printLinkedList();
        ll.addMidle(15,3);

        ll.printLinkedList();
        ll.removeLast();
        ll.printLinkedList();
        int arr [] = {1,2,3};
        ll.addAll(arr);
        ll.printLinkedList();
        ll.removeFirst();
        ll.printLinkedList();
        System.out.println("Size of the linkedList is :- " + ll.getSize());

    }
}

class LinkedList1 {
    Node head;

    void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print(" null");
        System.out.println();
    }


    void add(int e){
        Node temp = new Node(e);
        if(head == null ){
            head = temp;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;

            }
            curr.next = temp;
        }
    }
    void addFirst(int e){
        Node temp = new Node(e);
        if(head == null ){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    void addAll(int [] elements){
        for(int e: elements)
            add(e);
    }

    void addMidle(int e, int index){
        if(index == 0){
            addFirst(e);
        }else{
            Node temp = new Node(e);
            int count = 0;
            Node curr = head;
            while(count < index-1){
                curr = curr.next;
                count++;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
    }
    void removeFirst(){
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }else if (head.next == null){
            head = null;
        } else if (head.next != null) {
            Node curr = head;
            head = head.next;
            curr.next = null;
        }


    }

    void removeLast(){
        if(head == null){
            System.out.print(" list is empty");
        }else if (head.next == null){
            head = null;
        }else {
            Node curr = head;
            while(curr.next.next!=null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    int getSize(){
        Node curr = head;
        int count = 0;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        return count;
    }

}


 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        // size++;
    }

}
