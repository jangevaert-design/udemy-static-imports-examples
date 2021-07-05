package edu.cnm.deepdive;

public class StaticImportsExamples {

  public static void main(String[] args) {
    int min = Math.min(5, 7);
    System.out.println("min = " + min);
    System.out.println(Math.PI);
    // we can import the static java.lang.Math.* class and then remove the word Math before min and PI.

    // we could also import java.lang.System.out and remove System and start printing with out.println().

    Config.printConfig();
    //this works but we can also "import static edu.cnm.deepdive.Config.*" and remove Config before the method.
  }

}
