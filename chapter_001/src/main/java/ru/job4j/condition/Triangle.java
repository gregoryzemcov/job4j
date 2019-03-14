package ru.job4j.condition;
/**
 * Программа возвращает максимальное значение из двух заданных чисел
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
public class Triangle {
	/**
	* Method вычисления полупериметра по длинам сторон.
	* Формула (a + b + c) / 2.
	* @param a, b, c точки треугольника a b c.
	* @return Периметр.
	*/
	public double period(double a, double b, double c) {
		return (a + b + c) / 2;
	}
	/**
	* Method должен вычислить площадь треугольника.
	* @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
	*/
	public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
		double rsl = -1;
		double a = new Point().distance(x1, y1, x2, y2);
		double b = new Point().distance(x2, y2, x3, y3);
		double c = new Point().distance(x1, y1, x3, y3);
		double p = period(a, b, c);
		if (this.exist(a, b, c)) {
			rsl = Math.sqrt(p * (p - a) * (p - c) * (p - b));
		}
		return rsl;
	}
	/**
	* Method проверяет можно ли построить треугольник с такими длинами сторон.
	* @param a, b, c Длина от точек a b с.
	* @return boolean.
	*/
	private boolean exist(double a, double b, double c) {
		return a + c > b && a + b > c && c + b > a; 
	}
}