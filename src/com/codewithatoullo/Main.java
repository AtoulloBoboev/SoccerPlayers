package com.codewithatoullo;

/** Дворовый футбол. Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
 * - Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
 * - Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
 * - Статическое поле countPlayers, которое считает количество игроков на футбольном поле
 * (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
 * - Геттеры для полей “выносливость” и “количество игроков”.
 *
 * и следующие методы:
 * run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
 * Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
 * info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6,
 * то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “Мест в команде больше нет”.
 * Задание: Создать класс Player по вышеописанному шаблону.
 * Экземпиляр класса при создании должен иметь знасение выносливости от 90 до 100.
 * Создать 6 игроков, Вызвать метод info(). При попытке создать 7,8 … n игрока,
 * количество игроков на поле меняться не должно, проверить это.
 * Примените к одному игроку метод run(), пока он полностью не выдохнется
 * (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.
 */

public class Main {

    public static void main(String[] args) {
        //Создать 6 игроков, Вызвать метод info().
        Player player1 = new Player(90);
        Player player2 = new Player(93);
        Player player3 = new Player(98);

        Player.info();

        Player player4 = new Player(91);
        Player player5 = new Player(94);
        Player player6 = new Player(100);

        Player.info();

        //При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
        Player player7 = new Player(92);

        Player.info();

        //Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.
        for (int i=0; i<94; i++)
            player5.run();

        Player.info();
    }
}