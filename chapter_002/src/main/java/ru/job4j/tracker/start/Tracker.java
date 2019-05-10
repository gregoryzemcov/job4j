package ru.job4j.tracker.start;
/**
 * Класс "Системы заявок".
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */
import ru.job4j.tracker.models.*;
public class Tracker {
	public final Item[] items = new Item[3];
	public static void main(String[] args) {		
		Tracker tracker = new Tracker();
		tracker.items[0] = new Item("Item", "desc", 10);
		tracker.items[1] = new Task("Task", "desc");
		tracker.items[2] = new Bug();
		for (Item item : tracker.items) {
			if (item instanceof Task) {
				Task task = (Task) item;
				System.out.println(task.calculatePrice());
			}
			System.out.println(item.getName() + " " + item.getDescription());
		}
	}
}