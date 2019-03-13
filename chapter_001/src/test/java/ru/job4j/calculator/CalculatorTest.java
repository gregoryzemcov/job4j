package ru.job4j.calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Программа проверки класса Calculator.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
 public class CalculatorTest {
	 /**
	  * Тест проверки method add.
	  * @param double first, double second.
	  * @return double add.
	  */
	  @Test
	  public void whenAddOnePlusOneThenTwo() {
		  Calculator calc = new Calculator();
		  double result = calc.add(1D, 1D);
		  double expected = 2D;
		  assertThat(result, is(expected));
	  }
	  /**
	  * Тест проверки method subtract.
	  * @param double first, double second.
	  * @return double subtract.
	  */
	  @Test
	  public void whenSubtractTwoMinusOneThenOne() {
		  Calculator calc = new Calculator();
		  double result = calc.subtract(2D, 1D);
		  double expected = 1D;
		  assertThat(result, is(expected));
	  }
	  /**
	  * Тест проверки method div.
	  * @param double first, double second.
	  * @return double div.
	  */
	  @Test
	  public void whenDivFourDivTwoThenTwo() {
		  Calculator calc = new Calculator();
		  double result = calc.div(4D, 2D);
		  double expected = 2D;
		  assertThat(result, is(expected));
	  }
	  /**
	  * Тест проверки method multiple.
	  * @param double first, double second.
	  * @return double multiple.
	  */
	  @Test
	  public void whenMultipleTwoMultipleTwoThenFour() {
		  Calculator calc = new Calculator();
		  double result = calc.multiple(2D, 2D);
		  double expected = 4D;
		  assertThat(result, is(expected));
	  }
 }