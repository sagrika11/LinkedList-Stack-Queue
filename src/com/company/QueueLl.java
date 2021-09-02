package com.company;
class NodeQ{
    int data;
    NodeQ next;
}
class queueUsingLinked{
    NodeQ front, rear;
    public void Create(int data){
        NodeQ node = new NodeQ();
        node.data = data;
        if(front==null && rear==null){
            front= rear = node;
        }
        else{
           rear.next = node;
           rear = node;
        }
    }
    public void peek()
    {
        System.out.println("Peek of Queue : " +front.data);
    }
    public void pop(){
        front= front.next;
    }
    public  void show(){
        NodeQ temp = front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
public class QueueLl {
    public static void main(String[] args) {
        queueUsingLinked k = new queueUsingLinked();
        k.Create(87);
        k.Create(86);
        k.Create(89);
        k.Create(88);
        k.Create(84);
        k.pop();
        k.peek();
        k.show();


    }
}
