package ru.job4j.ex;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Тест проверки класса Fact.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 30.04.2020.
 * @version $Id$.
 */
public class FactTest {
    @Test
    public void whenFact3() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void whenFactException() {
        int rsl = Fact.calc(-4);
        assertThat(rsl, is("Значение n не может быть меньше 0"));
    }
}
