package ru.job4j.ex;
/**
 * Класс подсчета количества цифр в заданном диапазоне.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 30.04.2020.
 * @version $Id$.
 */
public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less then finish.");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10, 2));
    }
}
