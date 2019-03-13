package ru.job4j.converter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Программа проверки класса Converter.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
 public class ConverterTest {
	 /**
	  * Тест проверки method rubToEuro().
	  * @result euro.
	  */
	  @SuppressWarnings("JavadocReference")
	  @Test
	  public void when70RubleToEuroThen1() {
		  Converter converter = new Converter();
		  int result = converter.rubToEuro(70);
		  assertThat(result, is(1));
	  }
	  /**
	   * Тест проверки method euroToRub().
	   * @return rub.
	   */
	   @SuppressWarnings("JavaDoc")
	   @Test
	   public void when1EuroToRubThen70() {
		   Converter converter = new Converter();
		   int result = converter.euroToRub(1);
		   assertThat(result, is(70));
	   }
	  /**
	   * Тест проверки method rubToDollar().
	   * @return dollar.
	   */
	   @Test
	   public void when60RubToDollarThen1() {
		   Converter converter = new Converter();
		   int result = converter.rubToDollar(60);
		   assertThat(result, is(1));
	   }
	   /**
	    * Тест проверки method dollarToRub().
		* @return rub.
		*/
		@SuppressWarnings("JavadocReference")
		@Test
		public void when1DollarToRubThen60() {
			Converter converter = new Converter();
			int result = converter.dollarToRub(1);
			assertThat(result, is(60));
		}
 }