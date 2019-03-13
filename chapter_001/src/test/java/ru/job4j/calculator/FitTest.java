package ru.job4j.calculator;
/**
 * Проверка класса Fit.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
public class FitTest {
	/**
	 * Тест проверки method manWeight().
	 * @return result.
	 */
	@SuppressWarnings("JavadocReference")
	@Test
	public void manWeight() {
		Fit fit = new Fit();
		double weight = fit.manWeight(180.0);
		assertThat(weight, closeTo(92.0, 0.1));
	}
	/**
	 * Тест проверки method womanWeight().
	 * @return result.
	 */
	@SuppressWarnings("JavadocReference")
	@Test
	public void womanWeight() {
		Fit fit = new Fit();
		double weight = fit.womanWeight(170.0);
		assertThat(weight, closeTo(69.0, 0.1));
	}
}