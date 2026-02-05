import java.util.Scanner;

public class CarRentalSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car car = new Car("Toyota", true);
        Customer customer = new Customer("John");

        System.out.print("Do you want to rent the car? (yes/no): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            if (car.isAvailable) {
                car.rentCar();
                System.out.println(customer.name + " rented the car.");
            } else {
                System.out.println("Car is not available.");
            }
        } else {
            System.out.println("Maybe next time.");
        }

        input.close();
    }
}

class Car {
    String model;
    boolean isAvailable;

    Car(String model, boolean isAvailable) {
        this.model = model;
        this.isAvailable = isAvailable;
    }

    void rentCar() {
        isAvailable = false;
        System.out.println("Car rented successfully.");
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}
