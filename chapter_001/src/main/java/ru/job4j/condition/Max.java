package ru.job4j.condition;
/**
 * Программа возвращает максимальное значение из двух заданных чисел
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
 public class Max {
	/**
	 * Метод возвращает максимальное значений из двух заданных чисел.
	 * @param int first, second.
	 * @return max.
	 */
	 @SuppressWarnings("JavadocReference")
	 public int max(int first, int second) {
		  return (first > second ? first : second);
	 }
 }