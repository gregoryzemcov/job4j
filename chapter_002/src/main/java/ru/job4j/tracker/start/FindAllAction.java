package ru.job4j.tracker.start;
/**
 * Класс поиска всех заявок через иетерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.02.2020.
 */
public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "== Show all items ==";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.findAll();
        return true;
    }
}
