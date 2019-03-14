package ru.job4j.condition;
/**
 * Программа возвращает максимальное значение из трех заданных чисел.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
 public class MultiMax {	 
	 public int max(int first, int second, int third) {
		  int max = (first > second ? first : second);
		  return (max > third ? max : third);
	 }	 
 }