package entity;

// Access Modifier - public, private, protected, default

public class Human {
  private String name;

  public int age, height, weight;

  public boolean isWalking, isEating, isSleeping;

  public static Animal animal;

  public Human(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.animal = new Animal();
  }

  void checkIsWalking() {
    if (this.isWalking) {
      System.out.println(this.name + " is walking.");
    } else {
      System.out.println(this.name + " is not walking.");
    }
  }

  public String getName() {
    return this.name;
  }

  void walk() {
    this.isWalking = true;
  }

  void eat() {
    this.isEating = true;
  }

  void sleep() {
    this.isSleeping = true;
  }

  void stopWalking() {
    this.isWalking = false;
  }

  void stopEating() {
    this.isEating = false;
  }

  void stopSleeping() {
    this.isSleeping = false;
  }

}
