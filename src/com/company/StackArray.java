package com.company;

import java.util.Scanner;

class stackUsingArray{


    int [] array = new int[6];
    int top =-1;
    public void create(int data) {
        if (top ==6) {
            System.out.println("Stack Overflow");

        } else {
            top++;
            array[top] = data;
        }
    }
    public void pop(){
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        top--;
    }
    public void peek(){
        System.out.println("Top Of the Stack is "+array[top]);
    }
    public void show(){
        System.out.println("Stack Element is : ");
        for (int i = top; i>=0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
public class StackArray {
    public static void main(String[] args) {
        stackUsingArray s = new stackUsingArray();
        s.create(9);
        s.create(12);
        s.create(65);
        s.create(89);
        s.create(79);


        s.pop();
        s.peek();
        s.show();
    }
}
