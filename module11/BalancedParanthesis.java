package module11;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input1 = "(())";
        String input2 = "(()";
        String input3 = "())";

        System.out.println(input1 + " is balanced: " + isBalanced(input1)); // true
        System.out.println(input2 + " is balanced: " + isBalanced(input2)); // false
        System.out.println(input3 + " is balanced: " + isBalanced(input3)); // false
    }

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
