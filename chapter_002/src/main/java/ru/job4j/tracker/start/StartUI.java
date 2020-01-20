package ru.job4j.tracker.start;
import ru.job4j.tracker.models.*;

/**
 * Класс интерфейса StartUI.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 19.10.2019.
 */
public class StartUI {
	public static void createItem(Input input, Tracker tracker) {
		System.out.println("== Create a new Item ==");
		String name = input.askStr("Enter name: ");
        String desc = input.askStr("Enter description: ");
        int time = input.askInt("Enter time: ");
		Item item = new Item(name, desc, time);
		tracker.add(item);
	}
	public static void replaceItem(Input input, Tracker tracker) {
		System.out.println("== Edit item ==");
		String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        String desc = input.askStr("Enter description: ");
        int time = input.askInt("Enter time: ");
		Item item = new Item(name, desc, time);
		tracker.replace(id, item);
	}
	public static void deleteItem(Input input, Tracker tracker) {
		System.out.print("== Delete item ==");
		String id = input.askStr("Enter id: ");
		tracker.delete(id);
	}
	public static void findAllItem(Input input, Tracker tracker) {
		System.out.println("== Show all items ==");		
		tracker.findAll();
	}
	public static void findById(Input input, Tracker tracker) {
		System.out.println("== Find item by Id ==");
		String id = input.askStr("Enter id: ");
		tracker.findById(id);
	}
	public static void findByName(Input input, Tracker tracker) {
		System.out.println("== Find items by name ==");
		String name = input.askStr("Enter name: ");
		tracker.findByName(name);
	}
    public void init(Input input, Tracker tracker, UserAction[] action) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
            // 0. Add new Item
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                // 1. Show all items
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                // 2. Edit item
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                // 3. Delete item
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                // 4. Find item by Id
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                // 5. Find items by name
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        String[] menu = {"0. Add new Item",
                "1. Show all items",
                "2. Edit item",
                "3. Delete item",
                "4. Find item by Id",
                "5. Find items by name",
                "6. Exit Program"};
        for (String s : menu) {
            System.out.println(s);
        }
    }	
    public static void main(String[] args) {
		Input input = new ConsoleInput();        
        Tracker tracker = new Tracker();
        UserAction[] action = new UserAction[100];
        new StartUI().init(input, tracker, action);
		StartUI.createItem(input, tracker);
    }
}