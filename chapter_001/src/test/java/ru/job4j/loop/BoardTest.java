package ru.job4j.loop;
/**
 * Тест проверки class Board.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class BoardTest {
	@Test
	public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
		Board board = new Board();
		String result = board.paint(3, 3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x%s x %sx x%s", line, line, line);
		assertThat(result, is(expected));
	}
	@Test
	public void whenPaintBoardWithWidthFiveAndHeightFiveThenStringWithFiveColsAndFiveRows() {
		Board board = new Board();
		String result = board.paint(5, 5);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x x%s x x %sx x x%s x x %sx x x%s", line, line, line, line, line);
		assertThat(result, is(expected));
	}
	 @Test
	 public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
		 Board board = new Board();
		 String result = board.paint(5, 4);
		 final String line = System.getProperty("line.separator");
		 String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
		 assertThat(result, is(expected));
	 }
 }