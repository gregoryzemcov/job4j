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
	  * @param double first, second.
	  * @return result.
	  */
	 public double add(double first, double second) {
		 return first + second;
	 }
	 /**
	  * Method subtract - вычитание из числа first числа second.
	  * @param 'double first, second.
	  * @return result.
	  */
	  public double subtract(double first, double second) {
		  return first - second;
	  }
	  /**
	  * Method div - деление числа first на число second.
	  * @param 'double first, second'.
	  * @return result.
	  */
	  public double div(double first, double second) {
		  return first / second;
	  }
	  /**
	  * Method multiple - перемножение двух чисел first & second.
	  * @param 'double first, second'.
	  * @return result.
	  */
	  public double multiple(double first, double second) {
		  return first * second;
	  }
 }