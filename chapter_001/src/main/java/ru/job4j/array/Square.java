package ru.job4j.array;
/**
 * Программа заполниния массива степенями чисел.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
public class Square {
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 1; i <= rst.length; i++) {
			rst[i - 1] = i * i;
		}
		return rst;
	}
}