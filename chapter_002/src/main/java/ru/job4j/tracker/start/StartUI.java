package ru.job4j.tracker.start;
import ru.job4j.tracker.models.*;
import ru.job4j.tracker.profession.*;
import java.util.Scanner;
/**
 * Класс интерфейса StartUI.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 19.10.2019.
 */
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
            // 0. Add new Item
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                String desc = scanner.nextLine();
                Long time = scanner.nextLong();
                Item item = new Item(name, desc, time);
                tracker.add(item);
            } else if (select == 1) {
                // 1. Show all items
                System.out.println("=== Show all items ====");
                tracker.findAll();
            } else if (select == 2) {
                // 2. Edit item
                System.out.println("=== Edit item ====");
                String id = scanner.nextLine();
                Item item = new Item();
                tracker.replace(id, item);
            } else if (select == 3) {
                // 3. Delete item
                System.out.println("=== Delete item ====");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                // 4. Find item by Id
                System.out.println("=== Find item by Id ====");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                // 5. Find items by name
                System.out.println("=== Find items by name ====");
                System.out.print("");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        String s0, s1, s2, s3, s4, s5, s6;
        s0 = "0. Add new Item";
        s1 = "1. Show all items";
        s2 = "2. Edit item";
        s3 = "3. Delete item";
        s4 = "4. Find item by Id";
        s5 = "5. Find items by name";
        s6 = "6. Exit Program";
        String[] string = {s0, s1, s2, s3, s4, s5, s6};
        System.out.println(string);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}