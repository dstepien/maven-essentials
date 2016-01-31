package pl.dawidstepien.maven.scope;

import com.google.common.math.IntMath;

import java.math.RoundingMode;

public class Calculator {

  public int add(int a, int b) {
    return IntMath.checkedAdd(a, b);
  }

  public int subtract(int a, int b) {
    return IntMath.checkedSubtract(a, b);
  }

  public int multiply(int a, int b) {
    return IntMath.checkedMultiply(a, b);
  }

  public float divide(int a, int b) {
    return IntMath.divide(a, b, RoundingMode.CEILING);
  }
}
