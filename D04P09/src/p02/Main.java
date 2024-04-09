package p02;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public Double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            double poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        //stack.push(30.0);
        //stack.push(40.0);

        stack.display();

        // Popping twice
        System.out.print("After popping twice: ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.println(stack.pop());
    }
}
