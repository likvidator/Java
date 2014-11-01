package ru.netcracker.complex.Test;

import org.junit.Test;
import ru.netcracker.complex.Complex;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testAdd() throws Exception {
        Complex a = new Complex(1,1);
        Complex b = new Complex(2,2);
        a.add(b);
        assertEquals(a,new Complex(3,3));
    }

    @Test
    public void testSub() throws Exception {

    }

    @Test
    public void testMult() throws Exception {

    }

    @Test
    public void testPrint() throws Exception {

    }
}