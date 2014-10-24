package ru.fight.controller;

import ru.fight.model.Unit;
import ru.fight.view.ViewFight;

import java.util.Scanner;

public class Fight {
    public Unit a;
    public Unit b;

    public Fight(Unit a, Unit b){
        this.a=a;
        this.b=b;
    }
    public void Start() {

        System.out.println("Бой начинается!");
        while (!(a.isLive()==0) && !(b.isLive()==0)) {
            ViewFight view = new ViewFight();

            int oneAttack = view.hit(a.name);
            int oneBlock = view.block(a.name);

            int twoAttack = view.hit(b.name);
            int twoBlock = view.block(b.name);

            if (oneAttack!=twoBlock) {
                blow(oneAttack, a, b);
            }
            if (twoAttack!=oneBlock) {
                blow(twoAttack, b, a);
            }
            System.out.println("Жизни " + a.name + " " + a.isLive());
            System.out.println("Жизни " + b.name + " " + b.isLive());
        }
    }



    public static void blow(int blow, Unit a, Unit b){
        switch (blow) {
            case 1: {
                a.hit_head(b);
                break;
            }
            case 2: {
                a.hit_feet(b);
                break;
            }
            case 3: {
                a.hit_hands(b);
                break;
            }
            case 4: {
                a.hit_body(b);
                break;
            }
        }
    }
}
