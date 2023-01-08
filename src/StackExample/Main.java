package StackExample;

import java.util.Stack;

/*
Last In First Out (LIFO)
 */
public class Main {
    public static void main(String[] args) {
    /*
        Collection Stack
     */
        /*Stack<String> stack=new Stack<String>();
        stack.push("Saturday");
        stack.push("Sunday");
        stack.push("Monday");
        stack.push("Tuesday");
        stack.push("Wednesday");
        stack.push("Thursday");
        stack.push("Friday");

        System.out.println(stack.peek());
        System.out.println(stack.peek());*/

        StackExample stack = new StackExample(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }
}
