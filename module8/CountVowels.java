package module8;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int v = 0;
        int c = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}