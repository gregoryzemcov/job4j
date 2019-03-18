package ru.job4j.array;
/**
 * Тест проверки класса ArrayChar.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 18.03.2019.
 */
 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 public class ArrayCharTest {
	 @Test
	 public void whenStartWithPrefixThenTrue() {
		 ArrayChar word = new ArrayChar("Hello");
		 boolean result = word.startWith("He");
		 assertThat(result, is(true));
	 }
	 @Test
	 public void whenNotStartWithPrefixThenFalse() {
		 ArrayChar word = new ArrayChar("Hello");
		 boolean result = word.startWith("Hi");
		 assertThat(result, is(false));
	 }
	 @Test
	 public void whenStartWithLenghtPrefixThenFalse() {
		 ArrayChar word = new ArrayChar("Good");
		 boolean result = word.startWith("Goodbay");
		 assertThat(result, is(false));
	 }
 }