
class Student {
  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printName() {
    System.out.println("My name is " + this.name);
  }

  public void printAge() {
    System.out.println(this.name + "'s age is: " + this.age);
  }

  public void printDetail() {
    System.out.println(this.name);
  }

  public String printDetail(int age) {
    System.out.println(this.name);
    return "dsadsa";
  }

  public String printDetail(int age, int age1) {
    System.out.println(this.name);
    return "dsadas";
  }

}

public class Main {

  public static void main(String[] abc) {
    Student s1;
    // Student s2 = new Student("Lakshay", 22);
    if (abc.length > 0) {
      System.out.print("Argument is greater than 1: ");
      s1 = new Student("Harsh", 22);
      printArray(abc);
    } else {
      System.out.println("No Argument Passed ");
      s1 = new Student("Lakshay", 22);
    }
  }

  public static void printArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
  }
}