package ru.chugunov.application.services;

/**
 * Allows count all kind of characters or digits from string
 *
 * Задание
 *
 * Необходимо реализовать Rest сервис.
 * Используемые технологии: Java, Spring, mysql.
 * Система сборки по желанию: maven, gradle.
 * Система контроля версий: git.
 * Готовое задание залить на github.
 * Описание сервиса:
 * 1) По урлу /countDigits сервис должен отдавать количество цифр в заданной строке.
 * Пример: /countDigits?str=my brother has 12 apples and 1 cucumber ответ должен быть {3}. 12-2шт, 1-1шт. всего 3шт
 * 2) /listProcessedStrings должен отдавать список всех обработанных строк и количество цифр в них.
 * Это предполагает хранение результатов обработки в базе. Пример ответа: {“my brother have 12 apples and 1 cucumber”:3,”aaaa2t3”:2,”12345”:5}
 *
 *
 *
 * @author Andrei Chugunov
 */
public interface Counter {
    int count(String string);
}
