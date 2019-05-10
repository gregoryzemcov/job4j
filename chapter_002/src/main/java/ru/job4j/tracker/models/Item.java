package ru.job4j.tracker.models;
/**
 * Шаблон Класса "Заявка"
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */
public class Item {
	public String name;
	public String description;
	public long create;	
	public Item() { }
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}	
	public String getName() {
		return this.name;
	}	
	public String getDescription() {
		return this.description;
	}	
	public long getCreate() {
		return this.create;
	}
}