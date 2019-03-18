package ru.job4j.array;
/**
 * Программа поиска элемента в массиве, методом перебора.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 public class FindLoop {
	 public int indexOf(int[] data, int el) {
		 int rst = -1;
		 for (int i = 0; i < data.length; i++) {
			 if (data[i] == el) {
				 rst = i;
				 break;
			 }
		 }
		 return rst;
	 }
 }