package pl.dawidstepien.maven.scope;

public class Main {

  public static void main(String[] args) {
    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[2]);
    String operator = args[1];

    System.out.println(doOperation(a, operator, b));
  }

  private static String doOperation(int a, String operator, int b) {
    Calculator calculator = new Calculator();
    if(operator.equals("+")) {
      return String.valueOf(calculator.add(a, b));
    }

    if(operator.equals("-")) {
      return String.valueOf(calculator.subtract(a, b));
    }

    if(operator.equals("x")) {
      return String.valueOf(calculator.multiply(a, b));
    }

    if(operator.equals("/")) {
      return String.valueOf(calculator.divide(a, b));
    }

    return "Invalid operator";
  }
}
