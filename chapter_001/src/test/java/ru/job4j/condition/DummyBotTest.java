package ru.job4j.condition;
/**
 * Тест проверки класса DummyBot.
 * @author Gregory Zemtsov (griffondark@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 public class DummyBotTest {
	 @Test
	 public void whenGreetBot() {
		 DummyBot bot = new DummyBot();
		 assertThat(bot.answer("Привет, бот."), is("Привет, умник."));
	 }	 
	 @Test
	 public void whenByeBot() {
		 DummyBot bot = new DummyBot();
		 assertThat(bot.answer("Пока."), is("До скорой встречи."));
	 }	 
	 @Test
	 public void whenUnknownBot() {
		 DummyBot bot = new DummyBot();
		 assertThat(bot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
	 }
 } 