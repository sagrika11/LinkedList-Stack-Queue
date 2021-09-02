package com.company;
class queueUsingArray{
    int [] q = new int[5];
    int front,rear = -1;
    public void create(int data){
        if(rear==4){
            System.out.println("Queue is Full ");
        }
        else if(front==-1 && rear==-1){
            front=rear=0;
        }
        else {
            rear++;
            q[rear]=data;
        }
    }
    public void deletion(){
        if(front==-1 && rear ==-1){
            System.out.println("Queue is Empty");
        }
        else if(front==rear){
            front=rear=-1;
        }
        else {
            front++;
        }
    }
    public void show(){
        for (int i = front; i <rear+1 ; i++) {
            System.out.println(q[i]);
        }
    }
    public void peek(){
        System.out.println("Peek of Queue : " +q[front]);
    }
}
public class QueueArray {
    public static void main(String[] args) {
        queueUsingArray q = new queueUsingArray();
        q.create(70);
        q.create(23);
        q.create(20);
        q.create(60);
        q.create(80);
        q.deletion();
        q.peek();
        q.show();

    }
}
