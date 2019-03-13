package ru.job4j.condition;
/**
 * Программа расчета растояния между точками.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @since 28.03.2018.
 * @version 0.1.
 */
public class Point {
	/**
	 * Method calculation.
	 * @return
	 */
	@SuppressWarnings({"JavaDoc", "JavadocReference"})
	public double distance(int x1, int y1, int x2, int y2) {
		double first = Math.pow(x2 - x1, 2);
		double second = Math.pow(y2 - y1, 2);
		return Math.sqrt(first + second);
	}
}