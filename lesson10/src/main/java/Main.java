import stuff.base.Engineer;
import stuff.base.SEX;
import stuff.Developer;
import stuff.QA;

public class Main {
  public static void main(String[] args) {
      System.out.println("Lesson10");

      Developer dev = new Developer("John Doe", 21);
      Developer dev2 = new Developer("John Doe", 21, SEX.MALE);
      QA qa = new QA("Jane Roe", 21);

      dev.sayHello();
      qa.sayHello();
      dev2.sayHello();

      Engineer.staticMethod();
      // Developer.staticMethod();
  }

}
