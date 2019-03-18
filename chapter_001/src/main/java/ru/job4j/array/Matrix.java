package ru.job4j.array;
/**
 * Программа заполняющая таблицу умножения на заданный размер.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 public class Matrix {
	 public int[][] multiple(int size) {
		 int[][] table = new int[size][size];
		 for (int i = 0; i < table.length; i++) {
		 	for (int j = 0; j < table.length; j++) {
				table [i][j] = (i + 1) * (j + 1);
		    }
		 }
		 return table;
	 }
 }