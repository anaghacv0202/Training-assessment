package module5;

public class trycatch {
    public static void main(String[] args) {
        try {
            int[] a = {1};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Caught");
        } finally {
            System.out.println("Always runs");
        }
    }
}
