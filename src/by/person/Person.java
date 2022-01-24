package by.person;

import java.util.Objects;

public class Person {

    private String name;
    private String lastName;
    private char gender;
    private int age;
    private long id;
    private boolean swim;
    private boolean read;
    private boolean sleep;
    private boolean run;


    public Person(String name, String lastName, char gender, int age, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public Person (){}

    public void printInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("<name> " + name + " </name>");
        System.out.println("<lastName> " + lastName + " </lastName>");
        System.out.println("<age> " + age + " </age>");
        System.out.println("<id> " + id + " </id>");
        System.out.println("<gender> " + gender + " </gender>");
        System.out.println("--------------------------------------------------");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && age == person.age && id == person.id && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender, age, id);
    }

    public void run() {
        System.out.println("Person " + this.name + " is running");
    }


    public void read() {
        System.out.println("Person " + this.name + " is reading");
    }

    public void sleep() {
        System.out.println("Person " + this.name + " is sleeping");
    }

    public void swim() {
        System.out.println("Person " + this.name + " is swimming");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
