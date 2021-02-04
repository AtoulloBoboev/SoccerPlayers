package com.codewithatoullo;

/**
 * Класс Игрок (англ. Player) содержит следующие поля:
 * - Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
 */

public class Player {
    private int stamina;

    //Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    //Статическое поле countPlayers, которое считает количество игроков на футбольном поле
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        //При попытке создать 7,8 … n игрока количество игроков на поле меняться не должно, проверить это
        if (countPlayers < 6)
            countPlayers++;
    }

    //run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
    //Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
    public void run() {
        if (stamina == 0)
            return;
        ;
        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    //info() -  выводит сообщение в зависимости от количества игроков на поле.
    public static void info() {
        //Если игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “Мест в команде больше нет”.
        if (countPlayers < 6) {
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("Мест в командах болюше нет");
        }
    }


}
