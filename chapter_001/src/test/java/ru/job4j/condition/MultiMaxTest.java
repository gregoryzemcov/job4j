package ru.job4j.condition;
/**
 * Проверка класса MultiMax
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * version $Id$.
 * @since 14.03.2019.
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 public class MultiMaxTest {
	 @Test
	 public void whenSecondMax() {
		 MultiMax maximum = new MultiMax();
		 int result = maximum.max(1, 2, 3);
		 assertThat(result, is(3));
	 }
	 @Test
	 public void whenFirstMax() {
		 MultiMax maximum = new MultiMax();
		 int result = maximum.max(3, 1, 2);
		 assertThat(result, is(3));
	 }
	 @Test
	 public void whenAllMax() {
		 MultiMax maximum = new MultiMax();
		 int result = maximum.max(2, 2, 2);
		 assertThat(result, is(2));
	 }
 }