package com.company;

import java.util.Scanner;

class NodeC{
    int data;
    NodeC next;
}
class singleCircularLl{
    NodeC head, tail;
    Scanner sc = new Scanner(System.in);
    int nde =0;
    public void create(){
        System.out.println("Enter the number of nodes : ");
        nde = sc.nextInt();
        System.out.println("Enter the data : ");
        for (int i = 0; i <nde ; i++){
            int data = sc.nextInt();
            NodeC node = new NodeC();
            node.data = data; node.next=null;
            if(head==null){
                head=tail= node;
            }
            else {
                tail.next = node;
                tail= node;
                tail.next=head;
            }
        }
    }
    public void show(){
        NodeC temp = head;

        while (temp.next!=head){
            System.out.print(temp.data +" ");
            temp= temp.next;
        }
        System.out.println(temp.data);
    }
}
public class circularLinkedList {
    public static void main(String[] args) {
        singleCircularLl scc = new singleCircularLl();
        scc.create();
        scc.show();
    }
}
