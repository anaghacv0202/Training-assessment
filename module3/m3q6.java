package module3;

public class m3q6 {
    String accountNumber;
    double balance;

    m3q6(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        m3q6 account = new m3q6("TRIP-123", 1000.0);
        account.deposit(500);
        System.out.println("Balance: " + account.balance);
    }
}
