package BridgeLabz.assignment2;
// 1. Create a class Car with instance variables model and year. Create two car objects and display their details.

// class Car {
//     String model;
//     int year;
// }
// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.model = "Honda City";
//         c1.year = 2020;
//         Car c2 = new Car();
//         c2.model = "Hyundai i20";
//         c2.year = 2022;
//         System.out.println(c1.model + " - " + c1.year);
//         System.out.println(c2.model + " - " + c2.year);
//     }
// }

// 2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.

// class Car {
//     String model;
//     int year;
//     static int numberOfCars = 0;
//     Car() {
//         numberOfCars++;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.model = "Honda City";
//         c1.year = 2020;
//         Car c2 = new Car();
//         c2.model = "Hyundai i20";
//         c2.year = 2022;
//         System.out.println("Number of cars created: " + Car.numberOfCars);
//     }
// }

// 3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?

class Car {
    void method() {
        int localVariable = 10;
        System.out.println("Local variable inside method: " + localVariable);
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.method();
        // System.out.println("Local variable outside method: " + localVariable);
        // localVariable cannot be resolved to a variable
        // The above print statement will cause compilation error because localVariable is not accessible outside its method.
    }
}