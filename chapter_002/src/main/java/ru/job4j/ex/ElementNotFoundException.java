package ru.job4j.ex;
/**
 * Класс обработки исключения.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 08.05.2020.
 * @version $Id$.
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
