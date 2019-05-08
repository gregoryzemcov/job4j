package ru.job4j.profession;
/**
 * Класс Ingineer, наследуемый от класса Profession
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 05.05.2019.
 */
 public class Engineer extends Profession {
	 public String build;
	 public String directionInConstruction;
	 public Engineer(String name, String profession) {
		 this.name = name;
		 this.profession = directionInConstruction;
	 }
	 public String build() {
		 return build;
	 }
 }