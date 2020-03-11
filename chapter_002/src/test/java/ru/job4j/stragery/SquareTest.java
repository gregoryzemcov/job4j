package ru.job4j.stragery;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест вывода квадрата через интерфейс.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 05.03.2020.
 * @version $Id$.
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++++")
                                .add("+    +")
                                .add("+    +")
                                .add("++++++")
                                .toString()
                )
        );
    }
}
