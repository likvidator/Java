package ru.fight.view;




import java.util.Scanner;

public class ViewFight {
    Scanner s = new Scanner(System.in);
    public int hit(String name ){
        System.out.println(name  +" Куда будешь бить?\n" +
                "1.Голова\n" +
                "2.Ноги\n" +
                "3.Руки\n" +
                "4.Тело");
        return s.nextInt();
    }
    public int block( String name ){
        System.out.println(name + " Куда поставить блок??\n" +
                "1.Голова\n" +
                "2.Ноги\n" +
                "3.Руки\n" +
                "4.Тело");
        return s.nextInt();
    }
}
