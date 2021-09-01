package com.company;

import java.util.Scanner;

class Node{
    int data;
    Node next;
}
class linkedList {
    Node head, tail;
    int nde = 0;

    Scanner sc = new Scanner(System.in);

    public void create() {
        System.out.println("Enter the number of Nodes : ");
        nde = sc.nextInt();
        System.out.println("Enter the data : ");
        for (int i = 0; i < nde; i++) {
            int data = sc.nextInt();
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }


    public void show() {
        Node temp = head;
        System.out.println("Given linkedList are : ");
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    public void insertAtStart() {
        Node node = new Node();
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;


    }

    public void insertAtAny(int data) {
        System.out.println("Enter the Location : ");
        int index = sc.nextInt();
        Node node = new Node();
        node.data = data;
        node.next = null;
        int i = 1;

        Node temp = head;
        if (index > nde) {
            System.out.println("Insertion is not possible " + index);
        } else {
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;


        }
    }

    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        tail.next = node;

    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        Node pre = null;
        Node temp = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
    }

    public void deleteAtAny() {
        System.out.println("Enter the Location : ");
        int index = sc.nextInt();
        Node temp = head;
        Node pre = null;
        if (index > nde) {
            System.out.println("Deletion is Not possible at " + index);
        } else {
            int i = 1;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            pre = temp.next;
            temp.next = pre.next;
        }
    }
    public void Reverse(){
        Node curr = head;
        Node temp = head;
        Node pre = null;
        while (temp!=null){
            temp= temp.next;
            curr.next= pre;
            pre = curr;
            curr = temp;
        }
        head = pre;
    }

}


public class LinearLinked{

    public static void main(String[] args) {
linkedList ll = new linkedList();
ll.create();
//ll.insertAtStart();
//ll.insertAtAny(100);
//ll.insertAtLast(2);
//ll.deleteFirst();
//ll.deleteLast();
//ll.deleteAtAny();
ll.Reverse();
ll.show();

    }
}
