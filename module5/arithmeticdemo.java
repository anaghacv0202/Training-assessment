package module5;
public class arithmeticdemo {
    public static void main(String[] args) {
        try {
            int r = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

