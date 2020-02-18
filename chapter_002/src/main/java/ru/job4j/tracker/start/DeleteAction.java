package ru.job4j.tracker.start;
/**
 * Класс удаления заявки через иетерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.02.2020.
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "== Delete item ==";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = input.askStr(" ");
        tracker.delete(id);
        return true;
    }
}
