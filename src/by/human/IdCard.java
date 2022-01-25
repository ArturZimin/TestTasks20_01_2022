package by.human;

import java.util.Date;

public class IdCard {

    private int number;
    private Date dateExpire;

    public IdCard(int number, Date date) {
        this.number = number;
        this.dateExpire = new Date();
    }

    public IdCard(int number) {
        this.number = number;
    }

    public IdCard() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "number=" + number +
                ", dateExpire=" + dateExpire +
                '}';
    }
}
