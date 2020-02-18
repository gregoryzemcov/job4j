package ru.job4j.tracker.start;
import ru.job4j.tracker.models.Item;
/**
 * Класс создания заявки через иетерфейс UserAction.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 17.02.2020.
 */
public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "== Create a new Item ==";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr(" ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
