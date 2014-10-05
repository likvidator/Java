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
            int one = s.nextInt();
            System.out.println("Игрок 2. Куда будешь бить?\n" +
                    "1.Голова\n" +
                    "2.Ноги\n" +
                    "3.Руки\n" +
                    "4.Тело");
            int two = s.nextInt();
            blow(one,a,b);
            blow(two,b,a);
            System.out.println(a.live);
            System.out.println(b.live);
        }
    }

    public static void blow(int blow, Unit a, Unit b){
        switch (blow) {
            case 1: {
                a.blow_head(b);
                break;
            }
            case 2: {
                a.blow_feet(b);
                break;
            }
            case 3: {
                a.blow_hands(b);
                break;
            }
            case 4: {
                a.blow_body(b);
                break;
            }
        }
    }
}
