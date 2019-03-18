package ru.job4j.array;
/**
 * Тест проверки класса FindLoop.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class FindLoopTest {
	 @Test
	 public void whenArrayHasLengh5Then0() {
		 FindLoop find = new FindLoop();
		 int[] input = new int[] {5, 10, 3};
		 int value = 5;
		 int result = find.indexOf(input, value);
		 int expect = 0;
		 assertThat(result, is(expect));
	 }
	 @Test
	 public void whenArrayHasLengh7ThenError() {
		 FindLoop find = new FindLoop();
		 int[] input = new int[] {5, 10, 3};
		 int value = 7;
		 int result = find.indexOf(input, value);
		 int expect = -1;
		 assertThat(result, is(expect));
	 }
 }