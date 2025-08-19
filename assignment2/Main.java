package BridgeLabz.assignment2;
// 1. Create a class Car with instance variables model and year. Create two car objects and display their details.

// 2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.

class Car {
    String model;
    int year;
    static int numberOfCars = 0;
    Car() {
        numberOfCars++;
    }   
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Honda City";
        c1.year = 2020;
        Car c2 = new Car();
        c2.model = "Hyundai i20";
        c2.year = 2022;
        System.out.println(c1.model + " - " + c1.year);
        System.out.println(c2.model + " - " + c2.year);
        System.out.println("Total number of cars created: " + Car.numberOfCars);
    }
}
