package ru.fight;

import ru.fight.controller.Fight;
import ru.fight.model.Unit;
import ru.fight.view.Start;


public class Main {
    public static void main(String[] args)  {
        Start a = new Start();
        a.startGame();
        Unit One = a.getA();
        Unit Two = a.getB();
        Fight round = new Fight(One,Two);
        round.Start();
    }

}
