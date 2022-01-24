package by.animal;

public class Fish extends Animal {

    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public Fish(){}

    public boolean isCanEat() {
        return canEat;
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "sizeInFt=" + sizeInFt +
                ", canEat=" + canEat +
                '}' + "{ age = " + getAge() + "}" + "{" +
                "gender = " + getGender() + "}";
    }
}
