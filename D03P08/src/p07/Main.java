package p07;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create TreeMap to store Car details
        TreeMap<Car, Integer> carDetails = new TreeMap<>();

        // Predefined information of 4 Car details
        carDetails.put(new Car("Bugatti", 80050.0), 1);
        carDetails.put(new Car("Swift", 305000.0), 2);
        carDetails.put(new Car("Audi", 600100.0), 3);
        carDetails.put(new Car("Benz", 900000.0), 4);

        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Car, Integer> greatestEntry = carDetails.lastEntry();
        System.out.println("Car with the greatest price:");
        System.out.println(greatestEntry.getKey());

        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Car, Integer> leastEntry = carDetails.firstEntry();
        System.out.println("Car with the least price:");
        System.out.println(leastEntry.getKey());
    }
}
