package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Matrix.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */ 
 public class MatrixTest {
	 @Test
	 public void when2On2() {
		 Matrix matrix = new Matrix();
		 int[][] table = matrix.multiple(2);
		 int[][] expect = {
			 {1, 2}, {2, 4}
		 };
		 assertThat(table, is(expect));
	 }
	 @Test
	 public void when3On3() {
		 Matrix matrix = new Matrix();
		 int[][] table = matrix.multiple(3);
		 int[][] expect = {
			 {1, 2, 3}, {2, 4, 6}, {3, 6, 9}
		 };
		 assertThat(table, is(expect));
	 }
	 @Test
	 public void when4On4() {
		 Matrix matrix = new Matrix();
		 int[][] table = matrix.multiple(4);
		 int[][] expect = {
				 {1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}
		 };
		 assertThat(table, is(expect));
	 }
 }