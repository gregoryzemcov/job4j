package ru.job4j.loop;
/**
 * Программа построения шахматной доски в псевдографике.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @since 18.03.2019.
 * @version 0.1.
 */
 public class Board {
	 public String paint(int width, int height) {
		 StringBuilder screen = new StringBuilder();
		 String ln = System.lineSeparator();
		 for (int i = 0; i < height; i++) {
			 for (int j = 0; j < width; j++) {
				  if ((i + j) % 2 == 0) {
					  screen.append("x");
				  } else {
					  screen.append(" ");
				  }
			 }
			 screen.append(ln);
		 }
		 return screen.toString();
	 }
 }