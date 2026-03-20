package module11;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack: " + s);
        reverseStack(s);
        System.out.println("Reversed Stack: " + s);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int x = s.pop();
        reverseStack(s);
        insertAtBottom(s, x);
    }

    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertAtBottom(s, x);
        s.push(temp);
    }
}

