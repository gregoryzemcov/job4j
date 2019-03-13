package ru.job4j.calculator;
/**
 * Программа "Калькулятор" - вычисление простых арифметических операций.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
 public class Calculator {
	 /**
	  * Method add - сложение двух слагаемых.
	  * @return result.
	  */
	 @SuppressWarnings("JavadocReference")
	 public double add(double first, double second) {
		 return first + second;
	 }
	 /**
	  * Method subtract - вычитание из числа first числа second.
	  * @return result.
	  */
	  @SuppressWarnings({"JavaDoc", "JavadocReference"})
	  public double subtract(double first, double second) {
		  return first - second;
	  }
	  /**
	  * Method div - деление числа first на число second.
	  * @return result.
	  */
	  @SuppressWarnings({"JavaDoc", "JavadocReference"})
	  public double div(double first, double second) {
		  return first / second;
	  }
	  /**
	  * Method multiple - перемножение двух чисел first & second.
	  * @return result.
	  */
	  @SuppressWarnings({"JavaDoc", "JavadocReference"})
	  public double multiple(double first, double second) {
		  return first * second;
	  }
 }