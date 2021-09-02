package com.company;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next, pre;

}
class DoubleLl{
    Node1 head, tail;
    Scanner sc = new Scanner(System.in);
    int nde =0;
    public void create(){
        System.out.println("Enter the number of nodes : ");
        nde = sc.nextInt();
        System.out.println("Enter the data : ");
        for (int i = 0; i <nde ; i++) {
            int data = sc.nextInt();
            Node1 node = new Node1();
            node.data = data; node.next=null;
            if(head==null)
                head=tail=node;
            else {
                tail.next = node;
                node.pre = tail;
                tail = node;
            }
        }

    }
    public void show(){
        Node1 temp = head;
        System.out.println("The linkedList are : ");
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void insertAtFirst(){
        System.out.println("Enter the data to insert at first : ");
        int data = sc.nextInt();
        Node1 node = new Node1();
        node.data = data; node.next = null;
        node.next=head;
        head.pre = node;
        head=node;
    }
    public void insertAtAny(int data){
        Node1 node = new Node1();
        node.data= data; node.next=null;
        System.out.println("Enter the location of node : ");
        int index = sc.nextInt();
        if(index>nde){
            System.out.println("Insertion is not possible at " + index);
        }else {
            Node1 temp = head;
           int i = 1;
           while (i<index-1){
               temp= temp.next;
               i++;
           }
           node.pre= temp;
           node.next=temp.next;
           temp.next=node;
           temp.next.pre=node;

        }
    }
    public void deleteFirst(){
     head= head.next;
     head.pre= null;
    }
    public void deleteLast(){
        Node1 temp = head;
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.pre.next= null;

    }
    public void deleteAtAny(){
        System.out.println("Enter the Location to delete the node : ");
        int index = sc.nextInt();
        if (index>nde){
            System.out.println("Deletion is not possible at " + index);
        }
        else {
            Node1 temp = head;
            Node1 prev = null;
            int i = 1;
            while (i<index-1){
                temp = temp.next;
                i++;
            }
           prev = temp.next;
            temp.next = prev.next;
            prev.next.pre = temp;
        }
    }
    public void reverseDll(){
        Node1 node;
        Node1 current = head;
        while (current!=null){
          node = current.next;
            current.next = current.pre;
            current.pre=node;
            current=node;
        }
        current = head;
        head=tail;
        tail = current;
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLl dll = new DoubleLl();
        dll.create();;
     // dll.insertAtFirst();
        //dll.insertAtAny(17);
        //dll.deleteFirst();
        //dll.deleteLast();
       // dll.deleteAtAny();
        dll.reverseDll();
       dll.show();

    }
}
