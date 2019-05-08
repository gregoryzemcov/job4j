package ru.job4j.profession;
/**
 * Класс Teacher, наследуемый от класса Profession.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 05.05.2019.
 */
 public class Teacher extends Profession {
	 public String teach;
	 public String directionInEducation;
	 public Teacher(String name, String profession) {
		 this.name = name;
		 this.profession = directionInEducation;
	 }
	 public String teach() {
		 return teach;
	 }
 }