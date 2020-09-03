public class FinalVariable {

final int x = 10;
}
public class DemoFinalVariable {
  public static void main(String[] args) {
    FinalVariable obj = new FinalVariable();
    obj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(obj.x);
  }
}