package p01;

class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String element) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("Stack is full. Cannot push element: " + element);
        }
    }

    public String pop() {
        if (top >= 0) {
            String poppedElement = stackArray[top];
            top--;
            return poppedElement;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
       
        stack.push("Hello");
        stack.push("world");
        stack.push("Java");
        stack.push("Programming");

        System.out.print("After Pushing 4 Elements: ");
        stack.display();

        // Popping an element from the stack
        String poppedElement = stack.pop();
        System.out.println("After a Pop: " + stack.pop() + " " + stack.pop()+ " " + stack.pop());

        
    }
}
