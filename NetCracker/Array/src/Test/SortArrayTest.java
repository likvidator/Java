package Test;

import org.junit.Test;
import ru.netcracker.Array;
import ru.netcracker.SortArray;

import static org.junit.Assert.*;

public class SortArrayTest {

    @Test
    public void testAdd() throws Exception {
        SortArray a = new SortArray();
        a.add(6);
        a.add(5);
        a.add(1);
        a.add(2);
        assertEquals(a.getByIndex(0),new Integer(1));
        assertEquals(a.getByIndex(1),new Integer(2));
        assertEquals(a.getByIndex(2),new Integer(5));
        assertEquals(a.getByIndex(3),new Integer(6));
    }

    @Test
    public void testMin() throws Exception {
        SortArray a = new SortArray();
        a.add(6);
        a.add(5);
        a.add(1);
        a.add(2);
        assertEquals(a.min(),new Integer(1));
    }

    @Test
    public void testMax() throws Exception {
        SortArray a = new SortArray();
        a.add(6);
        a.add(5);
        a.add(1);
        a.add(2);
        assertEquals(a.min(),new Integer(1));
    }

    @Test
    public void testSort() throws Exception {
        SortArray a = new SortArray();
        a.add(6);
        a.add(5);
        a.add(1);
        a.add(2);
        assertEquals(a.getByIndex(0),new Integer(1));
        assertEquals(a.getByIndex(1),new Integer(2));
        assertEquals(a.getByIndex(2),new Integer(5));
        assertEquals(a.getByIndex(3),new Integer(6));
    }
}