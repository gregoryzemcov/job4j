package ru.job4j.array;
/**
 * Программа проверяющая заполнение массива true или false.
 * @author Gregory Zemtsov (griffondar@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
public class Check {
	public boolean mono(boolean[] data) {
		boolean result = true;
		for (boolean b : data) {
            if (b != data[0]) {
				result = false;
				break;
			}
        }
		return result;
	}
}