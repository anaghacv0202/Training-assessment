package module3;

public class m3q3 {
    String name;
    int marks;

    m3q3(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        m3q3 s1 = new m3q3("Anagha", 85);
        s1.display();
    }
}
