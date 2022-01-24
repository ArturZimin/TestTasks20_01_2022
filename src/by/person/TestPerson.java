package by.person;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Olga", "Ivanowa", 'f', 21, 1234);
        Person person2 = new Person("Ira", "Banowa", 'f', 26, 1234);
        Person person3 = new Person("Lena", "Panowa", 'f', 23, 12784);
        Person person4 = new Person("HKJk", "Ivanowa", 'f', 27, 56);
        Person person5 = new Person("Olga", "Ivanowa", 'f', 20, 1674);
        Person person6 = new Person("Kiril", "Ivanowa", 'm', 29, 12564);
        Person person7 = new Person("Andrey", "Kop", 'm', 27, 1265);
        Person person8 = new Person("Anya", "Ivanowa", 'f', 25, 12234);
        Person person9 = new Person("Olga", "Ivanowa", 'f', 28, 1734);
        Person person10 = new Person("Olga", "Ivanowa", 'f', 22, 1204);

        person1.printInfo();
        person1.read();
        person2.printInfo();
        person2.run();
        person3.printInfo();
        person3.sleep();
        person4.printInfo();
        person4.swim();
    }
}
