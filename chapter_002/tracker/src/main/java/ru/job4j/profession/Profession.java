package ru.job4j.profession;
/**
 * Базовый класс профессий
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 05.05.2019.
 */ 
 public class Profession {
	 public String name;
	 public String profession;
	 public Profession() { }
	 public Profession(String name, String profession) {
	 	this.name = name;
	 	this.profession = profession;
	 }	 
	 public String getName() {
		 return this.name;
	 }
	 public String getProfession() {
		return this.profession;
	}
 }