package ru.job4j.condition;
/**
 * Программа Бот отвечающий на вопросы.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
 public class DummyBot {
	 /**
	  * Бот отвечающий на вопросы.
	  * @param question вопрос боту.
	  * @return answer ответ бота.
	  */
	  public String answer(String question) {
		String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
		if ("Привет, бот.".equals(question)) {
			rsl = "Привет, умник.";
		} else if ("Пока.".equals(question)) {
			rsl = "До скорой встречи.";
		}
		return rsl;
	  }
 }