package ru.fight.view;

import ru.fight.model.Unit;
import ru.fight.model.*;

import java.util.Scanner;


public class Start {
    private static Unit a;
    private static Unit b;

    public static void startGame(){
        Scanner s = new Scanner(System.in);
        System.out.println("Добро пожаловать!\nВведите имя первого персанажа");
        String name = s.next();
        System.out.println("!\nВыбиерите рассу персанажа");
        System.out.println("1.Человек\n"+
                "2.Эльф\n"+
                "3.Орк\n"+
                "4.Дриады");
        int unit = s.nextInt();
        System.out.println("Добро пожаловать!\nВведите имя второго персанажа");
        String ename = s.next();
        System.out.println("Выбирите, против кого вы хотите сразиться!\n1.Человек\n" +
                "2.Эльф\n" +
                "3.Орк\n" +
                "4.Дирады");
        int enemy = s.nextInt();
        a=swit(unit,name);
        b=swit(enemy,ename);
    }

    public static Unit swit(int a, String name) {
        switch (a) {
            case 1: {
                return new People(name);
            }
            case 2: {
                return new Elf(name);
            }
            case 3:{
                return new Orc(name);
            }
            case 4:{
                return new Driad(name);
            }
        }
        return null;
    }


    public Unit getA() {
        return a;
    }

    public Unit getB() {
        return b;
    }
}
