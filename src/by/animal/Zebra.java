package by.animal;

public class Zebra extends Animal{

    private boolean is_wild;

    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);
        this.is_wild = is_wild;
    }

    public Zebra(){}

    public boolean isIs_wild() {
        return is_wild;
    }

    public void setIs_wild(boolean is_wild) {
        this.is_wild = is_wild;
    }

    public void run(){
        System.out.println("Zebra is running now.");
    }

    @Override
    public String toString() {

        return "Zebra{" +
                "is_wild=" + is_wild +
                '}'+"{age = "+getAge()+'}'+
                "{ gender = "+getGender()+"}";
    }
}
