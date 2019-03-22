package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Программа проверки класса MatrixCheck.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 public class MatrixCheckTest {
	 @Test
	 public void whenData3MonoByTrueThenTrue() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, true, true}, 
			 {false, true, true}, 
			 {true, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(true));
	 }
	 @Test
	 public void whenDataNot3MonoTrueThenFalse() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, true, false}, 
			 {false, true, false},
			 {true, true, false}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(false));
	 }
	 @Test
	 public void whenDataNot4MonoTrueThenFalse() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
			 {true, true, false, false},
			 {false, false, true, false},
			 {false, false, true, true},
			 {false, false, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(false));
	 }
	 @Test
	 public void whenDataNot4MonoTrueThenTrue() {
		 MatrixCheck check = new MatrixCheck();
		 boolean[][] input = new boolean[][] {
				 {true, false, true, false},
				 {false, true, false, true},
				 {true, false, true, false},
				 {false, true, false, true}
		 };
		 boolean result = check.mono(input);
		 assertThat(result, is(true));
	 }
 }