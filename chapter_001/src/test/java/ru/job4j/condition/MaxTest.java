package ru.job4j.condition;
/**
 * Тест проверки class Max.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * version $Id$
 * @since 14.03.2019
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 public class MaxTest {
	 @Test
	 public void whenFirstLessSecond() {
		 Max maximum = new Max();
		 int result = maximum.max(1, 3);
		 assertThat(result, is(3));
	 }
	 @Test
	 public void whenSecondLessFirst() {
		 Max maximum = new Max();
		 int result = maximum.max(3, 1);
		 assertThat(result, is(3));
	 }
	 @Test
	 public void whenFirstEquallySecond() {
		 Max maximum = new Max();
		 int result = maximum.max(4, 4);
		 assertThat(result, is(4));
	 }
 }