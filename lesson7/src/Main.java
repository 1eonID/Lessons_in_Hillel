import package1.School;
import package1.JelementaryGroup;
import student.Student;

public class Main {
  public static void main(String[] args) {
      System.out.println("Lesson7");

      School school1 = new School("Hillel");
      JelementaryGroup groupJava = new JelementaryGroup("Java");
      JelementaryGroup groupPython = new JelementaryGroup("Python");
      JelementaryGroup groupRuby = new JelementaryGroup("Ruby");
      Student student1 = new Student("Leonid");
      Student student2 = new Student("Oleg");

      groupJava.add(student1);
      groupJava.add(student2);

      school1.add(groupJava);

      System.out.println(school1);
   }
}
