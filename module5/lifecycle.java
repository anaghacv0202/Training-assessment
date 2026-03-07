package module5;
class lifecycle extends Thread {

    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {

        lifecycle t = new lifecycle();

        System.out.println("Thread State: " + t.getState());

        t.start();

        System.out.println("Thread State After Start: " + t.getState());
    }
}
