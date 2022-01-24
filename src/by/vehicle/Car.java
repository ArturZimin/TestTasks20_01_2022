package by.vehicle;

import java.util.Objects;

public class Car implements Vehicle {

    private int wheels;
    private int doors;

    @Override
    public void drive() {

    }

    @Override
    public void street(int i) {

    }

    @Override
    public void stop() {

    }

    public Car(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car() {
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && doors == car.doors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, doors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                '}';
    }
}
