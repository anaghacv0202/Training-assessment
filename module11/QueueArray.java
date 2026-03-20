package module11;
public class QueueArray {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);

        System.out.println(myQueue.dequeue()); // Output: 5
        System.out.println(myQueue.dequeue()); // Output: 10
    }
}

class Queue {
    int[] arr = new int[100];
    int front = 0;
    int rear = 0;
    void enqueue(int x) {
        if (rear == 100) {
            System.out.println("Queue Full");
            return;
        }
        arr[rear++] = x;
    }
    int dequeue() {
        if (front == rear) {
            System.out.println("Queue Empty");
            return -1;
        }
        return arr[front++];
    }
    boolean isEmpty() {
        return front == rear;
    }
}
