import entity.Animal;
import entity.Test;
import entity.Human;
import entity.Constant;

public class Main {
  public static void main(String[] args) {

    final Test test = new Test();

    System.out.print("");

    Animal an = new Animal();

    XYZ xy = new XYZ();

    Constant cs = new Constant();

    // System.out.println(cs.XYZ);

    // System.out.println(Constant.XYZ);

    System.out.println(Constant.PI);

    System.out.println(cs.ABC);

    Human human1 = new Human("Harsh", 15, 166, 1223);

    Human.animal.xyz();

    // System.out.println(human1.getName());

  }
}
