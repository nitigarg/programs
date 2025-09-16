package StackImplementation;

import java.util.Scanner;

public class MyStack {
    private final int  MAX_STACK_SIZE=10;
    private int top=-1;
    int stack[]=new int[MAX_STACK_SIZE];
    public void push(){
        if (top==MAX_STACK_SIZE-1) {

            System.out.println("Stack Overflow");
            return;
        }
        else{
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter element");
            int n=scan.nextInt();
            top++;
            stack[top]=n;
        }
    }
 public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return ;
        }
        else{
          int  n=stack[top];
            top--;
            System.out.println("popped element "+n);
        }
 }
 public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
     }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(stack[top]);
            }
        }
 }
}
