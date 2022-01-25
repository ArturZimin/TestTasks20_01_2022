package by.human;

public class Room {

    private int number;

    public Room(int number) {
        this.number = number;
    }

    public Room() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                '}';
    }
}
