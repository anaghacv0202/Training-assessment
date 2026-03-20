package module9;
public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumDigits(123);
        System.out.println("The sum of digits is: " + result);
    }
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}
