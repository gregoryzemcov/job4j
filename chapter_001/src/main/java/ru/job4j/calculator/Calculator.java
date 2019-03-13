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
	  * @param double first, double second.
	  * @return double first + second.
	  */
	 public double add(double first, double second) {
		 return first + second;
	 }
	 /**
	  * Method subtract - вычитания из числа first.
	  * @param double first, double second.
	  * @return double first - second.
	  */
	  public double subtract(double first, double second) {
		  return first - second;
	  }
	  /**
	  * Method div - деления числа first.
	  * @param double first, double second.
	  * @return double first / second.
	  */
	  public double div(double first, double second) {
		  return first / second;
	  }
	  /**
	  * Method multiple - умножения двух чисел.
	  * @param double first, double second.
	  * @return double first - second.
	  */
	  public double multiple(double first, double second) {
		  return first * second;
	  }
 }