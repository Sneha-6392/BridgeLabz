package BridgeLabz.assignment2;
// 1. Create a class Car with instance variables model and year. Create two car objects and display their details.
class Car {
    String model;
    int year;
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
    }
}
