package module9;
public class BinaryStrings  {
    public static void main(String[] args) {
        int length = 3;
        generateBinary(length, "");
    }

    public static void generateBinary(int n, String res) {
        if (res.length() == n) {
            System.out.println(res);
            return;
        }
        generateBinary(n, res + "0");
        generateBinary(n, res + "1");
    }
}

