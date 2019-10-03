package ru.job4j.tracker.start;
import ru.job4j.tracker.models.*;
import java.util.*;
/**
 * Класс "Системы заявок".
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$
 * @since 05.05.2019.
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return id Уникальный ключ.
     */
    private String generateId() {
        Random generator = new Random();
		long start = System.currentTimeMillis();
		return String.valueOf(generator.nextInt() + start);
    }
	/**
	 * Метод редактирования заявки.
	 * @return boolean.
	 */
	 public boolean replace(String id, Item item) {
	     boolean result = false;
		for (int i = 0; i < position; i++) {
			if (this.items[i].getId().equals(id)) {
				items[i] = item;
				item.setId(id);
				result = true;
				break;
			}
		}
		return result;
	 }
	 /**
	 * Метод удаления заявки.
	 * @return boolean.
	 */
	 public boolean delete(String id) {
	 	 boolean result = false;
	 	 for (int i = 0; i < this.position; i++) {
			 if (this.items[i].getId().equals(id)) {
                 items[i] = null;
				 System.arraycopy(items, i + 1, this.items, i, this.position - i);
				 position--;
				 result = true;
				 break;
			 }
		 } 
		 return result;
	 }
	 /**
	 * Метод получения списка всех заявок не равных null.
	 * @return items.
	 */
	 public Item[] findAll() {
	 	 return Arrays.copyOf(this.items, this.position);	 	 
	 }
	 /**
	 * Метод получения списка по имени.
	 * @return items.
	 */
	 public Item[] findByName(String key) {
	 	 Item[] result = new Item[position];
		 int count = 0;
	 	 for (int i = 0; i < position; i++) {
			if (this.items[i].getName().equals(key)) {
				result[count++] = this.items[i];
			 }
		 }
		 return Arrays.copyOf(result, count);
	 }
	 /**
	 * Метод получения заявки по id.
	 * @return items.
	 */
	 public Item findById(String id) {
		Item result = null; 	
		for (Item i : items) {
			if (i.getId().equals(id)) {
				result = i;
				break;
			}
		}
		 return result;
	 }
}