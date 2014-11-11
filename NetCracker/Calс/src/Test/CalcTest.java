package Test;

import org.junit.Test;
import ru.netcracker.Calc;

import java.awt.*;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testStart() throws Exception {
        Calc c = new Calc();
        String a;

        a ="2+2";
        a=c.start(a);
        assertEquals("4.0", a);

        a = "3+2";
        a=c.start(a);
        assertEquals("5.0", a);

        a = "2+2*2";
        a=c.start(a);
        assertEquals("6.0", a);

        a = "3*2+14/2";
        a=c.start(a);
        assertEquals("13.0", a);

        a = "123/0";
        a=c.start(a);
        assertEquals("Деление на 0", a);

        a= "123a/a";
        a=c.start(a);
        assertEquals("Некорректное выражение",a);
    }
}