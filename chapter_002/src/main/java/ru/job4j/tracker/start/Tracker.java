package ru.job4j.tracker.start;
/**
 * Класс "Системы заявок".
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */
 import java.util.Arrays;
 import java.lang.*;
 //import java.util.UUID;
import ru.job4j.tracker.models.*;
public class Tracker {
	private final Item[] items = new Item[100];
	private int position = 0;	
	/**
	 * Метод реализующий добавление заявки в хранилище.
	 * @param item новая заявка.
	 */
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}
	/**
	 * Метод генерирует уникальный ключ для заявки, на времени и произвольном числе.
	 * @return id.
	 */
	 public String generateId() {		 
		 return Math.random(10).toString();
		 //return UUID.randomUUID();
	 }
	 /** +
	  * Метод замены ячейки в массиве Item[].
	  * @return boolean.
	  */
	  public boolean replace(String id, Item item) {		 
		 while (true) {
			 if (this.items[this.position].getId().equals(id)) {
				 items[i] = temp;
			 }
		 }
		 return rst;
	  }
	  /** 
	  * Метод удаления ячейки в массиве Item[].
	  * @return boolean.
	  */
	  public boolean delete(String id) {
		  int elemIndex = Arrays.binarySearch(items, id);
		  boolean rst = false;
		  int unique = items.length;
		  for (int i = 0; i < unique; i++) {
			  for (int j = i + 1; j < unique; j++) {
				  if (items[i].getId().equals(generateId())) {
					  items[j] = items[unique - 1];
					  unique--;
					  j--;
				  }
			  }
		  }
		  Arrays.copyOf(items, unique);
		  if () {
		  	rst = true;
		  }
		  return rst;
	  }
	  /** 
	  * Метод возврата копии массива Item[].
	  * @return this.items без null элементов.
	  */
	  public Item[] findAll(String items[]) {
		  String nothing = null;
		  int unique = items.length;
		  for (int i = 0; i < unique; i++) {
			  for (int j = i; j < unique; j++) {
				  if (this.items[i].equals(nothing)) {
					  this.items[j] = this.items[unique - 1];
					  unique--;
					  j--;
				  }
			  }
		  }
		  return Arrays.copyOf(items, unique);		  
	  }
	  /** 
	  * Метод сравнения всех элементов массива this.item (используя метод getName класса Item) с аргументом метода String key.
	  * @return copyArray.
	  */
	  public Item[] findByName(String key) {		  
		  return null;
	  }
	  /** 
	  * Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
	  * @return Items если не найден то null.
	  */
	  public Item[] findById(String id) {
		  String id = Arrays.binarySearch(items, id);
		  return null;
	  }
}