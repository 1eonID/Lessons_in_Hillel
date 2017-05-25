package stuff.base;

public class Engineer {
    private String name;
    private int age;
    private SEX sex;

    // public static final String DEFAULT_SEX = "-";

    public Engineer() {}

    public Engineer(String name, int age, SEX sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
    }

    public void sayHello() {
      System.out.println("Hello from " + name + "{" + sex +
      "}" + " [" + getClass().getName() + "]");
    }

    public static void staticMethod() {
      System.out.println("Yes, I'm static method");
    }
}
