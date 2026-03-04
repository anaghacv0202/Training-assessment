package module2;
import java.util.Scanner;
public class m2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n = sc.nextInt();
        System.out.println("enter second number");
        int m = sc.nextInt();
        System.out.println("enter third number");
        int p = sc.nextInt();
        if ((n > m) && (n > p)) {
            System.out.println(n + " is greater");
        } else if ((m > p) && (m > n)) {
            System.out.println(m + " is greater");
        } else {
            System.out.println(p + " is greater");
        }
    }
}
