package by.customer;

import java.util.Date;

public class NormalOrder extends Order {

    public NormalOrder(String name, String location, Date date, String number) {
        super(name, location, date, number);
    }

    @Override
    public void confirm() {
        super.confirm();
    }

    @Override
    public void close() {
        super.close();
    }

    public void receive(Order o) {
        System.out.println("Order " + o + " is accepted");
    }

    public void dispatch(Order o) {
        System.out.println("dispatch");

    }
}
