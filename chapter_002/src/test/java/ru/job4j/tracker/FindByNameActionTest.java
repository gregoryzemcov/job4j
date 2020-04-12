package ru.job4j.tracker;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import ru.job4j.tracker.start.*;
import ru.job4j.tracker.models.*;
/**
 * Тест проверки класса FindByNameAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 02.04.2020.
 */
public class FindByNameActionTest {
    @Test
    public void whenCheckOutputName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
		Tracker tracker = new Tracker();
		Item item = new Item("Petr");
		tracker.add(item);
		FindByNameAction act = new FindByNameAction();
		act.execute(new StubInput(new String[] {}), tracker);
		String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
			.add(item.getId() + " " + item.getName())
			.toString();
		assertThat(new String(out.toByteArray()), is(expect));
		System.setOut(def);
    }
}
