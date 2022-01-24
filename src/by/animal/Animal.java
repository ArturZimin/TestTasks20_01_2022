package by.animal;

import java.util.Objects;

public class Animal {

    private int age;
    private String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Animal() { }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(gender, animal.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean isMammal(Duck d) {
        System.out.println("Duck is mammal.");
        return true;
    }
    public boolean isMammal(Zebra z) {
        System.out.println("Zebra is mammal.");
        return true;
    }
    public boolean isMammal(Fish f) {
        System.out.println("Fish is not mammal.");
        return false;
    }

    public boolean mate() {
        return false;
    }


}
