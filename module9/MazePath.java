package module9;
public class MazePath{
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        System.out.println("Paths to (1,1):");
        findPaths(rows, cols, "");
    }

    public static void findPaths(int r, int c, String path) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        if (r > 1) {
            findPaths(r - 1, c, path + "D");
        }

        if (c > 1) {
            findPaths(r, c - 1, path + "R");
        }
    }
}

