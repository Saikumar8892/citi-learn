package p04;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = element;
        nItems++;
    }

    public int dequeue() {
        int removedElement = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return removedElement;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void display() {
        System.out.print("Elements in queue: ");
        int current = front;
        for (int i = 0; i < nItems; i++) {
            System.out.print(queueArray[current] + " ");
            current = (current + 1) % maxSize;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Display elements in the queue
        queue.display();

        // Dequeue an element
        int removedElement = queue.dequeue();
        System.out.println("After removing first element");
        queue.display();
    }
}
