import java.util.Stack;

public class WorkWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ; // []      LIFO
        stack.push(1) ;  // [1 ]
        stack.push(2) ;  // [1 2 ]
        stack.push(3) ;  // [1 2 3] <-- top of stack
        System.out.println(stack);
        System.out.println("the top element inside the stack is :  " + stack.peek());
        System.out.println("the size of the stack is : " + stack.size());
        System.out.println(stack.pop()); // retrieve and delete the top element
        System.out.println("the top element inside the stack is :  " + stack.peek());
        System.out.println("the size of the stack is : " + stack.size());
        System.out.println("is this stack is empty stack ? " + stack.empty());


    }
}
