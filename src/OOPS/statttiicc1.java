package OOPS;

public class statttiicc1 {
    public static void main(String[] args) {

        Car.convertKMIntoMiles();
        Car nano = new Car();
        nano.calculateMilage();
        Car bmw = new Car();
        bmw.calculateMilage();
        Car safari = new Car();
        safari.calculateMilage();
    }
}
    class Car {
        static void convertKMIntoMiles() {
            System.out.println("Converting KM into Miles");

        }

        void calculateMilage() {
            System.out.println("Calculating the milage");
        }
    }

