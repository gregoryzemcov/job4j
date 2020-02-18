package ru.job4j.tracker.start;

public class Action implements UserAction {
    @Override
    public String name() {
        return "Menu: ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
