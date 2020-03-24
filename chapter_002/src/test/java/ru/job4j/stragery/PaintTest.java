package ru.job4j.stragery;
import org.junit.After;
import org.junit.Before;
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
	private final PrintStream stdout = System.out;
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	@Before
	public void loadOutput() {
		System.out.println("execute before method");
		System.setOut(new PrintStream(this.out));
	}
	@After
	public void backOutput() {		
		System.setOut(this.stdout);
		System.out.println("execute after method");
	}
    @Test
    public void whenDrawSquare() {        
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
    }
    @Test
    public void whenDrawTriangle() {        
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
    }
}
