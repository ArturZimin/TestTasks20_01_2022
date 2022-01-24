package by.customer;

import java.util.Objects;

public class Customer {

    private String name;
    private String location;

    public Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Customer(){}
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void sendOrder(Order o, String address) {
        System.out.println("The order " + o + " has been sent to the address " + address);
    }

    public void receiveOrder(Order o, String address) {
        System.out.println("The order " + o + " was accepted from  the address " + address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(location, customer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
