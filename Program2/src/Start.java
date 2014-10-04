import java.util.Scanner;


public class Start {
    private static Unit a;
    private static Unit b;

    public static void startGame(){
        Scanner s = new Scanner(System.in);
        System.out.println("Добро пожаловать!\nВыбиерите одного из персонажей");
        System.out.println("1.Человек\n"+
                "2.Эльф\n"+
                "3.Орк\n"+
                "4.Дирады");
        int unit = s.nextInt();
        System.out.println("Выбирите, против кого вы хотите сразиться!\n1.Человек\n" +
                "2.Эльф\n" +
                "3.Орк\n" +
                "4.Дирады");
        int enemy = s.nextInt();
        a=swit(unit);
        b=swit(enemy);
    }

    public static Unit swit(int a) {
        switch (a) {
            case 1: {
                return new People();
            }
            case 2: {
                return new Elf();
            }
            case 3:{
                return new Orc();
            }
            case 4:{
                return new Driad();
            }
        }
        return null;
    }


    public Unit setA() {
        return a;
    }

    public Unit setB() {
        return b;
    }
}
