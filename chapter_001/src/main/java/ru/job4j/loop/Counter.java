package ru.job4j.loop;
/**
 * Программа вычисляющая сумму четных чисел в заданном диапазоне.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
 public class Counter {
	 public int add(int start, int finish) {
	 	 int sum = 0;
		 for (int i = start; i <= finish; i++) {
			 if (i % 2 == 0) {
				sum = sum + i;
			 }
		 }
		 return sum;
	 }
 }