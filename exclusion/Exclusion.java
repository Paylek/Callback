package exclusion;

public class Exclusion {
    public static void main(String[] args) {
        Car car = new Car("Audi", 210, 16000);
        Car auto = new Car("Toyota", 231, 23444);
        try {
            car.start();
            auto.start();
        } catch (CarExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}
