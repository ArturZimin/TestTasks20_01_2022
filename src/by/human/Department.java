package by.human;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees = new Employee[40];

    private int count = 0;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        if (count <= 39) {
            employees[count] = e;
            count++;
        }
    }

    public void removeEmployee(Employee e) {
        for (int i = 0; i < employees.length; i++) {
            if (e.equals(employees[i])) {
                employees[i] = null;
            }
        }
    }
   public String getEmployees(Employee[] employee){
       return Arrays.toString(employee);
   }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +

                '}';
    }
}
