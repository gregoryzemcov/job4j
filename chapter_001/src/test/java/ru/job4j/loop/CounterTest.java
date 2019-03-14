package ru.job4j.loop;
/**
 * Проверка класса Counter.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
	@Test
	public void whenSumEvenNumbersFromOneTenThenThirty() {
		Counter counter = new Counter();
		int summ = counter.add(0, 10);
		assertThat(summ, is(30));
	}
}