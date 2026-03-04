package module3;

public class m3q4 {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        m3q4 calc = new m3q4();
        System.out.println("Sum: " + calc.add(10, 5));
        System.out.println("Difference: " + calc.subtract(10,5));
    }
}
