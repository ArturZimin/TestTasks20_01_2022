package by.animal;

public class Duck extends Animal {

    private Color color;

    public Duck(int age, String gender, Color color) {
        super(age, gender);
        this.color = color;
    }

    public Duck(){}

    public void swim() {
        System.out.println("Duck is swimming now.");
    }

    public void quack() {
        System.out.println("Quack!Quack!Quack!Duck is quacking now.");
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "color=" + color +
                '}' + "{ age = " + getAge() + "} {gender = " + getGender() + "}";
    }
}
