package com.company;

public class circularQueue {
    int [] cq = new int[5];
    int rear =-1, front =-1;
    public void create(int data){

        if((rear+1)%5==front){
            System.out.println("Queue is full");
        }
        else if(rear ==-1 && front ==-1){
            rear=front=0;
           cq[rear]=data;

        }
        else {
            rear=(rear+1)%5;
            cq[rear]=data;
        }

    }
    public void display(){
        int i = front;
        while (i!=rear){
            System.out.println(cq[i]);
            i = (i+1)%5;
        }
        System.out.println(cq[rear]);
    }
    public void pop(){
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%5;
        }
    }
    public static void main(String[] args) {
        circularQueue cq = new circularQueue();
        cq.create(89);
        cq.create(78);
        cq.create(56);
        cq.create(82);
        cq.create(8);
        cq.pop();
        cq.create(9);

        cq.display();
    }
}
