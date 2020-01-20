package ru.job4j.tracker.start;
/**
 * Класс StubAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.01.2020.
 */
public class StubAction implements UserAction {
	private boolean call = false;
	@Override
	public String name() {
		return "Stub action";
	}
	@Override
	public boolean execute(Input input, Tracker tracker) {
		call = true;
		return false;
	}
	public boolean isCall() {
		return call;
	}
}
