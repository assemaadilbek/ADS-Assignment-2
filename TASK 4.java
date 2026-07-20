import java.util.Stack;

public class RecursiveStackReverse {
    
    public static void reverseStack(Stack<Integer> stack) {
        // Base case: if the stack is empty, there's nothing left to do!
        if (stack.isEmpty()) {
            return;
        }
        
        // Pop the top element and hold onto it for a second
        int topElement = stack.pop();
        
        // Magically reverse the rest of the stack using recursion
        reverseStack(stack);
        
        // Now take that element we were holding and shove it at the very bottom
        insertAtBottom(stack, topElement);
    }
    
    // Helper function to push an item to the very bottom of a stack
    private static void insertAtBottom(Stack<Integer> stack, int item) {
        // We found the bottom! Put our item in.
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        
        // Otherwise, keep popping and holding until we hit rock bottom
        int topElement = stack.pop();
        insertAtBottom(stack, item);
        
        // Put all the other stuff back on top
        stack.push(topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] input = {9, 1, 3, 5, 7};
        
        for (int num : input) {
            stack.push(num);
        }
        
        reverseStack(stack);
        System.out.println(stack); 
    }
}
