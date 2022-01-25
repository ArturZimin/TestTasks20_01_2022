package by.human;

import java.util.Date;

public class TestHuman {

    public static void main(String[] args) {

        IdCard idCard1 = new IdCard(1232323, new Date());
        IdCard idCard2 = new IdCard(1233123, new Date());
        Department department1 = new Department("Deliver");
        Department department2 = new Department("Development");
        Employee employee1 = new Employee("Andrey", "Ivanov", "manager", idCard1, department1);
        Employee employee2 = new Employee("Olga", "Turna", "director", idCard1, department1);
        Employee employee3 = new Employee("Katya", "Ivanova", "shop assistant", idCard1, department1);
        Employee employee4 = new Employee("Artur", "Petrova", "developer", idCard2, department2);
        Employee employee5 = new Employee("Vladimir", "Rynda", "builder", idCard2, department2);

        employee4.showEmployee();
    }
}
