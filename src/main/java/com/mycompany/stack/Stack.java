/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;

/**
 *
 * @author Dell
 */


public class Stack <T> {

    
    T[] arr=(T[]) new Object[5];
    int top = -1;
    
    
    public boolean isEmpty() {
        if(top <= -1) {
            return true;
        }
        
        return false;
    }
    
    public boolean isfull() {
        if(top >= arr.length-1) {
            return true;
        }
        
        return false;
    }
    
    public void push(T value) {
        if(isfull()) {
            System.out.print("Stack overflow");
        }
        
        else{
            top++;
            arr[top]= value;
        }
    }
    
    public T pop() {
        if(isEmpty()) {
            System.out.print("Stack underflow");
            return null;
        }
        
        else {
            T value=arr[top];
            top--;
            return value;
        }
    }
    
    public T peek() {
        if(isEmpty()) {
            return null;
        }
        
        else {
            return arr[top];
        }
    }
    
    public void printStack() {
        if(isEmpty()) {
            System.out.print("Stack is Empty");
        }
        System.out.println("Stack Element");
        for(int i= 0; i<= top; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Stack<Integer> ob1= new Stack<>();
        
        ob1.push(5);
        ob1.push(10);
        ob1.push(100);
        ob1.push(1330);
        
        ob1.printStack();
        
        ob1.pop();
        
        ob1.printStack();
        
        System.out.println("Is Stack Empty:" + ob1.isEmpty());
        
        System.out.print("Top Element: :" + ob1.peek());
    }
}
