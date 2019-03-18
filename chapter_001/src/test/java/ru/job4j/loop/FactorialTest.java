package ru.job4j.loop;
/**
 * Тест проверки класса Factorial.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @since 17.03.2019
 * @version 0.1.
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class FactorialTest {
	 @Test
	 public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
		 Factorial factorial = new Factorial();
		 int result = factorial.calc(5);
		 assertThat(result, is(120));
	 }
	 @Test
	 public void whenCalculateFactorialForZeroThenOne() {
		 Factorial factorial = new Factorial();
		 int result = factorial.calc(0);
		 assertThat(result, is(1));
	 }
 }