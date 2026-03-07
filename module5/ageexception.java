package module5;
import java.util.Scanner;
public class ageexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible!");
        }
        System.out.println("You are eligible.");
        }
    }


