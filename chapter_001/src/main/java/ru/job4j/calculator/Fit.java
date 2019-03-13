package ru.job4j.calculator;
/**
 * Программа расчета идеального веса.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
public class Fit {
    double idealMan, idealWoman;
    final double manWEIGHT = 100, womanWEIGHT = 110, coef = 1.15;
    /**
     * Идеальный вес мужчины.
     * @param height рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        idealMan = (height - manWEIGHT) * coef;
        return idealMan;
    }
    /**
     * Идеальный вес женщины.
     * @param height рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        idealWoman = (height - womanWEIGHT) * coef;
        return idealWoman;
    }
}