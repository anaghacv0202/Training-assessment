package module8;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" ");
        String result = "";
        for (String w : words) {
            result += new StringBuilder(w).reverse().toString() + " ";
        }
        System.out.println(result.trim());
    }
}
