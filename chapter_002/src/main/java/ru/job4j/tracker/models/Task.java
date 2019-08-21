package ru.job4j.tracker.models;
/**
 * Шаблон класса "Задача", унаследован от Item.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */
 public class Task extends Item {
	 public Task(String name, String desc) { }
     public String calculatePrice() {
		 return "100%";
	 }
 }