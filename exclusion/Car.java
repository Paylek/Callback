package exclusion;

import java.util.Random;

public class Car {
    private String  brand;
    private int speed;
    private int price;

    public void start() throws CarExceptions {
        Random random = new Random();
        int ran = random.nextInt(20);
        if (ran % 2 == 1)
            System.out.println("Автомобиль завелся!");
        else throw new CarExceptions("Автомобиль не завелся");
    }

    public Car () {}

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
