package ru.job4j.tracker.profession;
/**
 * Класс Doctor, наследуемый от класса Profession
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 05.05.2019.
 */
 public class Doctor extends Profession {
 	 public String diagnose;
	 public String directionInMedicine;
	 public Doctor() { }
	 public Doctor(String name, String profession) {
		this.name = name;
		this.profession = directionInMedicine;
	 }
	 public String diagnose() {
		 return diagnose;
	 }
 }