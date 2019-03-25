package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;
/**
 * Тест проверки работы класса ArrayDuplicate.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 25.03.2019.
 */ 
 public class ArrayDuplicateTest {
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
		 String[] bound = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();
		 String[] resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет", "Мир", "Супер"};
		 assertThat(resultArray, arrayContainingInAnyOrder(expect));
	 }
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
		 String[] bound = {"Привет", "Мир", "Привет", "Супер", "Мир", "Ура", "Пока", "Ура"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();		 
		 String[] resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет", "Мир", "Ура", "Супер", "Пока"};
		 assertThat(resultArray, arrayContainingInAnyOrder(expect));
	 }
	 @Test
	 public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
		 String[] bound = {"Привет", "Привет", "Привет", "Привет"};
		 ArrayDuplicate duplicate = new ArrayDuplicate();		 
		 String[] resultArray = duplicate.remove(bound);
		 String[] expect = {"Привет"};
		 assertThat(resultArray, arrayContainingInAnyOrder(expect));
	 }
 }