package ru.job4j.tracker.start;
/**
 * Интерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.01.2020.
 */
public interface UserAction {
    String name();
    boolean execute(Input input, Tracker tracker);
}
