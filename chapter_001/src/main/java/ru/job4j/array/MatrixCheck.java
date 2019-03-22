package ru.job4j.array;
/** 
  * Программа сравнения элементов массива по диагонали на предмет равенства.
  * @author Gregory Zemtsov (griffondark@gmail.com).
  * @version $Id$.
  * @since 18.03.2019.
  */
public class MatrixCheck {
	public boolean mono(boolean[][] data) {
		boolean result = true;
		for (int i = 0; i < data.length; i++) {
			if ((data[0][0] != data[i][i]) || (data[0][data.length - 1] != data[i][data.length - 1 - i])) {
				result = false;
				break;
			}
		}
		return result;
	}
}
