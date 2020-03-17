package ru.job4j.stragery;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест вывода через интерфейс.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 16.03.2020.
 * @version $Id$.
 */
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++++")
                                .add("+    +")
                                .add("++++++")
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  +  ")
                                .add(" +++ ")
                                .add("+++++")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
