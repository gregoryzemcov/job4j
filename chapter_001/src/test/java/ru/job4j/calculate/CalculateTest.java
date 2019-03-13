package ru.job4j.calculate;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Программа проверки класса Calculate
 * @author Gregory Zemtsov (griffondark@gmail.com)
 * @version 0.1
 * @since 11.03.2019
 */
 public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Gregory Zemtsov";
		String expect = "Echo, echo, echo : Gregory Zemtsov"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 }