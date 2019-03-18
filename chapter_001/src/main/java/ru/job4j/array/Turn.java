package ru.job4j.array;
/**
 * Программа переворачивает массив.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 public class Turn {
	 public int[] turn(int[] array) {
		 for (int i = 0; i < array.length / 2; i++) {
			 int tmp = array[i];
			 array[i] = array[array.length - i - 1];
			 array[array.length - i - 1] = tmp;
		 }
		 return array;
	 }
 }