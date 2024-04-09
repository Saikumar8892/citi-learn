package p08;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    double price;

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

        // Remove and get a key-value mapping associated with the greatest key
        Map.Entry<Car, Integer> removedEntry = carDetails.pollLastEntry();
        System.out.println(removedEntry.getKey());

        // Replace the value mapped by the specified key with the new value
        double oldValue = 80050.0;
        double newValue = 80050.0; // Reva
        for (Map.Entry<Car, Integer> entry : carDetails.entrySet()) {
            if (entry.getKey().price == oldValue) {
                Car car = entry.getKey();
                carDetails.remove(car);
                carDetails.put(new Car("Reva", newValue), entry.getValue());
                break;
            }
        }

        // Print updated TreeMap
        for (Car car : carDetails.keySet()) {
            System.out.println(car);
        }
    }
}