package ru.job4j.ex;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
/**
 * Тест проверки класса Count.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 30.04.2020.
 * @version $Id$.
 */
public class CountTest {
    @Test
    public void when0to2then3() {
        int rsl = Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}
