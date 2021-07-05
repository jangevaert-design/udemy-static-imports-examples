package edu.cnm.deepdive;

public class Config {
  public static final String NAME = "myName";
  public static final int MAX_COLUMN_COUNT = 5;

  public static void printConfig() {
    System.out.println("name = " + NAME);
    System.out.println("columnCount = " + MAX_COLUMN_COUNT);
  }


}
