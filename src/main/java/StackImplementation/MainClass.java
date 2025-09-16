package StackImplementation;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Stack operations");
        System.out.println("Push");
        System.out.println("Pop");
        System.out.println("Display");
        System.out.println("Exit");
        String choice = scan.nextLine();
        do {
            switch (choice) {
                case "Push":
                    stack.push();
                    break;
                case "Pop":
                    stack.pop();
                    break;
                case "display":
                    stack.display();
                    break;
                case "Exit":
                    break;
            }
        }
        while(choice !="Exit") ;
    }
}
