package ru.job4j.tracker.start;
import java.util.Scanner;
/**
 * Класс итерфейса Input - ConsoleInput.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 19.10.2019.
 */
public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	@Override
	public String askStr(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
	@Override
	public int askInt(String question) {
		return Integer.parseInt(askStr(question));
	}

	@Override
	public int askInt(String question, int max) {
		int select = askInt(question);
		if (select >= 0 && select < max) {
			return select;
		} else {
			throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
		}
	}
}
