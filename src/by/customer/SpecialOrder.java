package by.customer;

import java.util.Date;

public class SpecialOrder extends Order{

    public SpecialOrder(String name, String location, Date date, String number) {
        super(name, location, date, number);
    }

    public SpecialOrder(){}

    @Override
    public void confirm() {
        super.confirm();
    }

    @Override
    public void close() {
        super.close();
    }

    public void dispatch(Order o){
        System.out.println("dispatch");

    }
}
