package com.company;
class NodeL{
    int data;
    NodeL next;
}
class StackLinkedList{
    NodeL top;
    public void create(int data){
        NodeL node = new NodeL();
        node.data= data; node.next= top;
        top = node;
    }
    public void show(){
        NodeL temp = top;
       while (temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }
    }
    public void pop(){
        top = top.next;
    }
    public  void peek(){
        System.out.println("Peek of the Stack is " + top.data);
    }
}
public class stackUsingLinked {
    public static void main(String[] args) {
        StackLinkedList n = new StackLinkedList();
        n.create(56);
        n.create(34);
        n.create(12);
        n.create(34);
        n.pop();
        n.peek();
        n.show();
    }
}
