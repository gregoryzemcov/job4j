package ru.job4j.tracker.start;
import ru.job4j.tracker.models.*;
/**
 * Класс интерфейса StartUI.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 19.10.2019.
 */
public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
			run = action.execute(input, tracker);
        }
    }
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
			System.out.println(index + ". " + actions[index].name());
		}        
    }	
    public static void main(String[] args) {
		Input validate = new ValidateInput();        
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction()};
        new StartUI().init(validate, tracker, actions);		
    }
}