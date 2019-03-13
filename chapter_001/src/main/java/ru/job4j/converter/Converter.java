package ru.job4j.converter;
/**
 * Конвертер валюты.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version 0.1.
 * @since 13.03.2019.
 */
 public class Converter {
	 /**
	  * Конвертируем рубли в евро.
	  * @return euro.
	  */
	  public int rubToEuro(int value) {
		  return value / 70;
	  }
	  /**
	   * Конвертируем евро в рубли.
	   * @result rub.
	   */
	   @SuppressWarnings("JavadocReference")
	   public int euroToRub(int value) {
		   return value * 70;
	   }
	  /**
	   * Конвертируем рубли в доллары.
	   * @return dollar.
	   */
	   @SuppressWarnings("JavadocReference")
	   public int rubToDollar(int value) {
		   return value / 60;
	   }
	   /**
	    * Конвертируем доллары в рубли.
		* @return rub.
		*/
		@SuppressWarnings("JavadocReference")
		public int dollarToRub(int value) {
			return value * 60;
		}
 }