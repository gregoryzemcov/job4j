package ru.job4j.ex;
/**
 * Класс поиска индекса элемента в строковом массиве.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 08.05.2020.
 * @version $Id$.
 */
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("This element not found");
        }
        return rsl;
    }
    public static void main(String[] args) {
        String[] value = {"1", "2", "3"};
        try {
            indexOf(value, "4");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
