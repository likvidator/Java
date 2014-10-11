package ru.fight.controller;

import java.util.Scanner;

public class Fight {
    public Unit a;
    public Unit b;

    public Fight(Unit a, Unit b){
        this.a=a;
        this.b=b;
    }
    public void Start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Бой начинается!");
        while (!a.isDead() && !b.isDead()) {

            System.out.println("Игрок 1. Куда будешь бить?\n" +
                    "1.Голова\n" +
                    "2.Ноги\n" +
                    "3.Руки\n" +
                    "4.Тело");
            int oneAttack = s.nextInt();

            System.out.println("Игрок 1. Куда поставить блок??\n" +
                    "1.Голова\n" +
                    "2.Ноги\n" +
                    "3.Руки\n" +
                    "4.Тело");
            int oneBlock =s.nextInt();

            System.out.println("Игрок 2. Куда будешь бить?\n" +
                    "1.Голова\n" +
                    "2.Ноги\n" +
                    "3.Руки\n" +
                    "4.Тело");
            int twoAttack = s.nextInt();

            System.out.println("Игрок 2. Куда поставить блок??\n" +
                    "1.Голова\n" +
                    "2.Ноги\n" +
                    "3.Руки\n" +
                    "4.Тело");
            int twoBlock = s.nextInt();

            if (oneAttack!=twoBlock) {
                blow(oneAttack, a, b);
            }
            if (twoAttack!=oneBlock) {
                blow(twoAttack, b, a);
            }
            System.out.println(a.live);
            System.out.println(b.live);
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
