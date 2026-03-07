package module4;

public class garbagec {
    public void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        garbagec obj1 = new garbagec();
        garbagec obj2 = new garbagec();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}

