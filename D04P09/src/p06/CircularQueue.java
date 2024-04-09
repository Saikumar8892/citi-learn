package p06;

public class CircularQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularQueue(int size) {
        this.maxSize = size + 1; // One extra space is used to differentiate between full and empty conditions
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = element;
        nItems++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int removedElement = queueArray[front];
        front = (front + 1) % maxSize;
        nItems--;
        return removedElement;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        do {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        } while (i != (rear + 1) % maxSize);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);

        // Enqueue elements
        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.enqueue(-8);

        // Display elements in the circular queue
        circularQueue.display();

        // Dequeue an element
        System.out.println("After removing first element:");
        circularQueue.dequeue();

        // Display elements in the circular queue
        circularQueue.display();
    }
}
