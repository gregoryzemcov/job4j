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
		Item copyItems = item;
		boolean result = false;
		for (Item i : items) {
			if (i.getId().equals(id)) {
				items.set(i);
			}
		}
		 for (Item i : items) {
			 if(i != copyItems && i != null) {
				 result = true;
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
	 	 for(Item i : items) {
			 if(i.getId().equals(id)) {
				 items.remove(i);
				 break;
			 }
		 }
		 for (Item i : items) {
			 if (!i.getId().equals(id)) {
				 result = true;
			 }
		 }
		 return result;
	 }
	 /**
	 * Метод получения списка всех заявок не равных null.
	 * @return items.
	 */
	 public Item[] findAll(Item item) {
	 	 int nullElement = 0;
		 for (Item i : items) {
			 if(i == null) {
				 nullElement++;
			 }
		 }
		 Arrays.sort(items);
		 System.arraycopy(this.items, 0, items, 0, items.length - nullElement);
	 	 return this.items;
	 }
	 /**
	 * Метод получения списка по имени.
	 * @return items.
	 */
	 public Item[] findByName(String key) {
	 	 Item[] copyItems = new Item[items.length];
	 	 for (Item i : items) {
			 if (i.getName().contains(key)) {
			 	copyItems.add(i);
			 }
		 }
		 copyItems.findAll(copyItems);
		 return copyItems;
	 }
	 /**
	 * Метод получения заявки по id.
	 * @return items.
	 */
	 public Item findById(String id) {
		Item result = null; 	
		for(Item i : items) {
			if(i.getId().equals(id)) {
				result = i;
				break;
			}
		}
		 return result;
	 }
}
/**
2. Шилдт Г. - Java 8. Полное руководство (2015). Страница 189. Введение в управление доступом.
3. Шилдт Г. - Java 8. Полное руководство (2015). Страница 238. Защита доступа.

1. Метод public Item add(Item) добавляет заявку, переданную в аргументах в массив заявок this.items;
В методе add нужно проставить уникальный ключ в объект Item item.
Уникальный ключ нужно генерировать на основании времени и произвольного числа.
item.setId(this.generateId());
В качестве ключа нельзя использовать индекс.
 
2. Метод public boolean replace(String id, Item item) должен заменить ячейку в массиве this.items.
 Для этого необходимо найти ячейку в массиве по id.
 Метод должен вернуть boolean результат - удалось ли провести операцию.

3. Метод public boolean delete(String id) должен удалить ячейку в массиве this.items.
 Для этого необходимо найти ячейку в массиве по id.
 Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy().
 Метод должен вернуть boolean результат - удалось ли провести операцию.

4. Метод public Item[] findAll() возвращает копию массива this.items без null элементов;

5. Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
 сравнивая name (используя метод getName класса Item) с аргументом метода String key.
 Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;

6. Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
 сравнивая id с аргументом String id и возвращает найденный Item.
 Если Item не найден - возвращает null.
 */