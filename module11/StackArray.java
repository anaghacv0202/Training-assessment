package module11;
public class StackArray {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.pop()); // Output: 30
        System.out.println(myStack.pop()); // Output: 20
    }
}

class Stack {
    int[] arr = new int[100];
    int top = -1;
    void push(int x) {
        if (top >= 99) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    boolean isEmpty() {
        return (top < 0);
    }
}