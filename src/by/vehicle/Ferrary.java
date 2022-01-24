package by.vehicle;

public class Ferrary extends Car{

  private String badge;

  public Ferrary(int wheels, int doors, String badge) {
   super(wheels, doors);
   this.badge = badge;
  }

  public Ferrary(String badge) {
   this.badge = badge;
  }
  public void foo(){}
 }
