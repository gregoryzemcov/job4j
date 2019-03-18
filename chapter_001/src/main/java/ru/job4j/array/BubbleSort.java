package ru.job4j.array;
/**
 * Программа сортировки массива методом "пузырька".
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 public class BubbleSort {	 
	 public int[] sort(int[] array) {
		 for (int i = array.length - 1; i > 0; i--) {
			 for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			 }
		 }
		 return array;
	 }
 }