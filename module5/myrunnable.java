package module5;

class myrunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        myrunnable obj = new myrunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
