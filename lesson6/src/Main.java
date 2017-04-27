public class Main {
  public static void main(String[] args) {
    System.out.println("Lesson 6");
    int n = 5;
    int arr[][] = new int[n][n];
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            arr[i][j] = 5;
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }

    // String str = new String();
    // java.lang.String str2 = "";

    LightBulb bulb = new LightBulb();
    System.out.println("1 - " + bulb.isOn());
    bulb.switchState();
    System.out.println("2 - " + bulb.isOn());

    //System.out.println(bulb.state);
    LightBulb bulb2 = new LightBulb();

    System.out.println("3 - " + bulb.equals(bulb2));
    bulb2.switchState();
    System.out.println("4 - " + bulb.equals(bulb2));

    System.out.println("5 - " + (bulb == bulb2)); // разные адреса в памяти

    System.out.println("6 - " + bulb.equals(bulb));

    System.out.println("7 - " + ("test" == "test"));
    System.out.println("8 - " + (new String("test") == "test"));
    System.out.println("9 - " + (new String("test") == new String("test")));
    System.out.println("10 - " + (("tes" + "t") == "test"));
    System.out.println("11 - " + (new String("test").equals("test")));
  }
}

  // class String {}
  class LightBulb {
    private String type = "LED";
    private boolean state = true;
    void on() {
      System.out.println("LightBulb ON!");
      state = true;
    }
    void off() {
      System.out.println("LightBulb OFF!");
      state = false;
    }
    void switchState() {
      state = !state;
    }
    boolean isOn() {
      return state;
    }

    boolean equals(LightBulb that) {
      if (this == that) return true;
      return state == that.state;
    }
  }
