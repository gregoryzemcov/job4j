package ru.job4j.tracker.start;
/**
 * Класс поиска заявки по имени через иетерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.02.2020.
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "== Find items by name ==";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr(" ");
        tracker.findByName(name);
        return true;
    }
}
