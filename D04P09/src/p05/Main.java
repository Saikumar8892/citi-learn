package p05;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            int removedElement = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return removedElement;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Elements in queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        // Display elements in the queue
        queue.display();

        // Dequeue two elements
        System.out.println("After removing two elements:");
        queue.dequeue();
        queue.dequeue();

        // Display elements in the queue
        queue.display();
    }
}