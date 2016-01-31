package pl.dawidstepien.maven.scope;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

  Calculator calculator;

  @Before
  public void setUp() throws Exception {
    calculator = new Calculator();
  }

  @Test
  public void shouldAdd() {
    // given
    int a = 4;
    int b = 8;

    // when
    int result = calculator.add(a, b);

    // then
    assertThat(result, is(equalTo(12)));
  }

  @Test
  public void shouldSubtract() {
    // given
    int a = 10;
    int b = 2;

    // when
    int result = calculator.subtract(a, b);

    // then
    assertThat(result, is(equalTo(8)));
  }

  @Test
  public void shouldMultiply() {
    // given
    int a = 2;
    int b = 7;

    // when
    int result = calculator.multiply(a, b);

    // then
    assertThat(result, is(equalTo(14)));
  }

  @Test
  public void shouldDivide() {
    // given
    int a = 12;
    int b = 3;

    // when
    float result = calculator.divide(a, b);

    // then
    assertThat(result, is(equalTo(4F)));
  }
}