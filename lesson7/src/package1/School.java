package package1;
import package1.JelementaryGroup;

public class School {
  String name;
  JelementaryGroup group;
  public School(String name) {
    this.name = name;
  }

  public void add(JelementaryGroup group) {
    this.group = group;
  }
}
