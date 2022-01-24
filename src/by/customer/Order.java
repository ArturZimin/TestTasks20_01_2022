package by.customer;

import java.util.Date;

public class Order extends Customer{

    private Date date;
    private String number;

    public Order(String name, String location, Date date, String number) {
        super(name, location);
        this.date = date;
        this.number = number;
    }
    public Order(){}

    public void confirm(){

    }

    public void close(){

    }

}
