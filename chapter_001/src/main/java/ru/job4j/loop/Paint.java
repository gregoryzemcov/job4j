package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * Программа построения пирамиды в псевдографике.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 18.03.2019.
 * @version $Id$.
 */
 public class Paint {
	 public String pyramid(int height) {
		return this.loopBy(height, 2 * height - 1, (row, column) -> row >= height - column - 1 && row + height - 1 >= column);
	}
	private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
 }