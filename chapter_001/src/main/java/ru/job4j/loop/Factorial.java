package ru.job4j.loop;
/**
 * Программа вычисляющая факториал числа.
 * @author Gregory Zemtsov (griffondark@gmail.com)
 * @since 17.03.2019
 * @version 0.1.
 */
 public class Factorial {
	 public int calc(int n) {
	 	int result = 1;
	 	if (n > 0) {
	 		for (int x = 1; x <= n; x++) {
			result = result * x;
			}
	 	}
	 	return result;
	}
 }