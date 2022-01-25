package by.human;

import java.util.Arrays;
import java.util.Objects;

public class Employee extends Human {


    private String position;
    private IdCard card;
    private Room[] room;
    private Department department;
    private PastPosition[] pastPositions;

    public Employee(String name, String surname, String position, IdCard card, Department department) {
        super();
        this.setName(name);
        this.setSurname(surname);
        this.position = position;
        this.card = card;
        this.department = department;
    }

    public Employee(String name, String surname, String position) {
        super();
        this.setName(name);
        this.setSurname(surname);
        this.position = position;
    }

    public Employee() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public PastPosition[] getPastPositions() {
        return pastPositions;
    }

    public void setPastPositions(PastPosition[] pastPositions) {
        this.pastPositions = pastPositions;
    }

    public void deleteRoom(Room r) {
        for (int i = 0; i < room.length; i++) {
            if (r.equals(room[i])) {
                room[i] = null;
            }
        }
    }

    public void deletePastPosition(PastPosition p) {
        for (int i = 0; i < pastPositions.length; i++) {
            if (p.equals(pastPositions[i])) {
                pastPositions[i] = null;
            }
        }
    }

    public void showEmployee(){
        System.out.println("-------------------------------------------");
        System.out.println( "Name: "+getName());
        System.out.println("Surname: " +getSurname());
        System.out.println( "IdCard: "+getCard());
        System.out.println("Department: "+ getDepartment());
        System.out.println("Position: "+ getPosition());
        System.out.println("-------------------------------------------");

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(position, employee.position) && Objects.equals(card, employee.card) && Arrays.equals(room, employee.room) && Objects.equals(department, employee.department) && Arrays.equals(pastPositions, employee.pastPositions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(position, card, department);
        result = 31 * result + Arrays.hashCode(room);
        result = 31 * result + Arrays.hashCode(pastPositions);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{name " + super.getName() + ", surname " + super.getSurname() +
                "position='" + position + '\'' +
                ", card=" + card +
                ", room=" + Arrays.toString(room) +
                ", department=" + department +
                ", pastPositions=" + Arrays.toString(pastPositions) +
                '}';
    }
}
