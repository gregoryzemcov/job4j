package ru.job4j.tracker.start;
/**
 * Класс поиска заявки по Id через иетерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.02.2020.
 */
public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "== Find item by Id ==";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = input.askStr(" ");
        tracker.findById(id);
        return true;
    }
}
