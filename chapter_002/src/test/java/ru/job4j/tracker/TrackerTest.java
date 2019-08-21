package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
import ru.job4j.tracker.start.*;
import ru.job4j.tracker.models.*;
/**
 * Тест проверки класса Tracker.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 29.05.2019.
 */
 public class TrackerTest {
	 @Test
	 public void whenAddNewItemThenTrackerHasSameItem() {
		 Tracker tracker = new Tracker();
		 long created = System.currentTimeMillis();
		 Item item = new Item("test0", "testDescription0", created);
		 tracker.add(item);
		 Item result = tracker.findById(item.getId());
		 assertThat(result.getName(), is(item.getName()));
	 }
	 @Test
	 public void whenDeleteItem() {
		 Tracker tracker = new Tracker();
		 Item previous = new Item("test0", "testDescription0", 10L);
		 tracker.add(previous);
		 Item next = new Item("test1", "testDescription1", 11L);
		 tracker.add(next);
		 tracker.delete(previous.getId());
		 tracker.findAll(previous);
		 assertThat(tracker, is(next));
	 }
	 @Test
	 public void whenReplaceNameThenReturnNewName() {
		 Tracker tracker = new Tracker();
		 Item previous = new Item("test1", "testDescription1", 123L);
		 tracker.add(previous);
		 Item next = new Item("test2", "testDescription2", 1234L);
		 next.setId(previous.getId());
		 tracker.replace(previous.getId(), next);
		 assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	 }
	 @Test
	 public void whenRemoveNullElementThenArrayWithoutNullElement() {
		 Tracker tracker = new Tracker();
		 Item first = new Item("Test1", "testDescription1", 123L);
		 Item second = new Item(null, null, 0L);
		 Item third = new Item("Test3", "testDescription3", 124L);
		 Item four = new Item(null, null, 0L);
		 tracker.add(first);
		 tracker.add(second);
		 tracker.add(third);
		 tracker.add(four);
		 Item[] copyItem = tracker.findAll(null);
		 Tracker expect = new Tracker();
		 expect.add(first);
		 expect.add(third);
		 assertThat(copyItem, arrayContainingInAnyOrder(expect));
	 }
	 @Test
	 public void whenItemFindByName() {
		 Tracker tracker = new Tracker();
		 Item first = new Item("testA", "decsA", 13L);
		 tracker.add(first);
		 Item second = new Item("B", "decsB", 14L);
		 tracker.add(second);
		 Item third = new Item("testC", "decsC", 15L);
		 tracker.add(third);
		 String key = "test";
		 Item[] result = tracker.findByName(key);
		 Tracker expect = new Tracker();
		 expect.add(first);
		 expect.add(third);
		 assertThat(result, is(expect));
	 }
	 @Test
	 public void whenItemFindById() {
		 Tracker tracker = new Tracker();
		 Item first = new Item("test", "decs", 16L);
		 Item second = new Item("test2", "decs2", 17L);
		 Item third = new Item("test3", "decs3", 18L);
		 tracker.add(first);
		 tracker.add(second);
		 tracker.add(third);
		 assertThat(tracker.findById(second.getId()), is(second));
	 }
 }