package stuff.base;

public enum SEX {
  MALE("M"), FEMALE("F"), NOT_DEFINED("N_D");

  private String asString;

  SEX() {}

  SEX(String asString) {
    this.asString = asString;
  }

  public String toString() {
    return asString;
  }
}
