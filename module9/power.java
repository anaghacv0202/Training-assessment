package module9;
public class power  {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println(base + " to the power of " + exponent + " is: " + result);
    }
    public static int power(int a, int b) {

        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
}

