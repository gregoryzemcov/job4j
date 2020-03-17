package ru.job4j.stragery;
import java.util.StringJoiner;
/**
 * Программа построения квадрата.
 * @author Gregory Zemtsov (griffondark@gmai.com).
 * @since 05.03.2020.
 * @version $Id$.
 */
 public class Square implements Shape {
	 @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("++++++");
        pic.add("+    +");
        pic.add("++++++");
        return pic.toString();
    }
 }