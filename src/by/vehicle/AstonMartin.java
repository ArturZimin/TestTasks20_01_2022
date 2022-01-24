package by.vehicle;

public class AstonMartin extends Car {

    private String label;

    public AstonMartin(String label) {
        this.label = label;
    }

    public AstonMartin(int wheels, int doors, String label) {
        super(wheels, doors);
        this.label = label;
    }

    public void bar() {

    }

}
