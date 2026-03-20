package module9;
public class printntoone {
    public static void main(String[] args) {
        printN(5); // Example call
    }

    public static void printN(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printN(n - 1);
    }
}

