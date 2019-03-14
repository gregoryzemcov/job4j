package ru.job4j.condition;
/**
 * Тест проверки class Triangle.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 14.03.2019.
 */
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
public class TriangleTest {
	 @Test
	 public void whenAreaSetThreePointsThenTriangleArea() {	 
		Triangle triangle = new Triangle();
		double result = triangle.area(0, 0, 0, 2, 2, 0);
		double expected = 2D;
		assertThat(result, closeTo(expected, 0.1));
	 }
}