package ru.job4j.models;
/**
 * Шаблон класса "Задача", унаследован от Item.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */ 
 @SuppressWarnings({"ALL", "SameReturnValue"})
 public class Task extends Item {
	 public Task(String name, String desc) {
		 this.name = name;
		 this.description = desc;
	 }	 
	 @SuppressWarnings("SameReturnValue")
     public String calculatePrice() {
		 return "100%";
	 }
 }