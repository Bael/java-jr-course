package io.github.bael.javacourse.knight.warriors;

import java.util.Optional;

/*
* Создайте обобщенный класс Duel, который можно проинициализировать 2 противниками.
Напишите его методы:
* битва до поражения одного из противников, возвращающий победителя в cхватке.
* Метод возвращающий более здорового противника,
* Метод возвращающий более сильного противника.
* Метод возвращающий более защищенного противника.
* Параметры должны наследовать базовый интерфейс.
*
* */
public interface Duel<T extends Actor, S extends Actor> {
    Optional<Actor> fight();
    Actor getHealthestWarrior();
    Actor getStrongestWarrior();
    Actor getMaxDefencedWarrior();
}
