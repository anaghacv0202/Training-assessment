package module4;
abstract class Shape {
    abstract void display();
}

class Circle extends Shape {
    void display() {
        System.out.println("This is a Circle");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.display();
    }
}



