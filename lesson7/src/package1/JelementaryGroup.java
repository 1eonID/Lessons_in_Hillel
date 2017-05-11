package package1;
import student.Student;

public class JelementaryGroup {
  String name;
  Student student;
  public JelementaryGroup(String name) {
    this.name = name;
  }

  public void add(Student student) {
    this.student = student;
  }
}
