import inheritance.Developer;
import inheritance.QA;
//import inheritance.*; использовать "*" не желательно

public class Main {
  public static void main(String[] args) {
      System.out.println("Lesson9");

      Developer dev = new Developer();
      QA qa = new QA();

      System.out.println(dev);
      System.out.println(qa);
  }

}
