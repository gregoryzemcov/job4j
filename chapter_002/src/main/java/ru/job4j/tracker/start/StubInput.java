package ru.job4j.tracker.start;
/**
 * Класс итерфейса Input - StubInput.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 19.12.2019.
 */
public class StubInput implements Input {
	private String[] answers;
	private int position = 0;
	public StubInput(String[] answers) {
		this.answers = answers;
	}
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
}
