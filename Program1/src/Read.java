import java.util.Scanner;

/**
 * Created by likvidator on 25.09.14.
 */
public class Read {
    public static boolean Read() {
        Scanner in = new Scanner(System.in);
        String c = in.next();
        if (c.equals("y") || c.equals("n")) {
            return c.equals("y");
        } else {
            System.out.println("Введенные значения не правельные");
            Read();
        }
        return false;

    }
}
