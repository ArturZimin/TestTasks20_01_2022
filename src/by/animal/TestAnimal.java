package by.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Duck d=new Duck(4,"male",Color.WHITE);
        Fish f=new Fish(4,"female",9,true);
        Zebra z=new Zebra(12,"female",true);

        d.isMammal(d);
        System.out.println(d.toString());
        f.isMammal(f);
        System.out.println(f.toString());
        z.isMammal(z);
        System.out.println(z.toString());


    }
}
