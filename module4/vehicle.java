package module4;

interface vehicle {
        void start();
    }
    class Car implements vehicle {
        public void start() {
            System.out.println("Car started");
        }
    public static void main(String[] args) {
            vehicle myCar = new Car();
            myCar.start();             
        }
    }
