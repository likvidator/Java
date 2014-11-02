package Test;

import ru.netcracker.MyArray;

import static org.junit.Assert.*;

public class MyArrayTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        MyArray a = new MyArray();
        a.add(1);
        assertEquals(a.getByIndex(a.find(1)),new Integer(1));
    }

    @org.junit.Test
    public void testGetByIndex() throws Exception {
        MyArray a = new MyArray();
        a.add(1);
        a.add(2);
        assertEquals(a.getByIndex(0),new Integer(1));
        assertEquals(a.getByIndex(1),new Integer(2));
    }

    @org.junit.Test
    public void testMin() throws Exception {
        MyArray a = new MyArray(1,2,3,4,5,4,3,2,1);
        int min = a.min();
        assertEquals(min,1);
    }

    @org.junit.Test
    public void testMax() throws Exception {
        MyArray a = new MyArray(1,2,3,4,5,4,3,2,1);
        int max = a.max();
        assertEquals(max,5);
    }

    @org.junit.Test
    public void testFind() throws Exception {
        MyArray a = new MyArray(1,2,3,4,5,4,3,2,1);
        int i = a.find(5);
        assertEquals(i,4);
    }

    @org.junit.Test
    public void testRemove() throws Exception {
        MyArray a = new MyArray(1,2,3,4,5,4,3,2,1);
        a.remove(a.find(5));
        assertEquals(a,new MyArray(1,2,3,4,4,3,2,1));
    }

    @org.junit.Test
    public void testSort() throws Exception {
        MyArray a = new MyArray(1,2,3,4,5,4,3,2,1);
        a.sort();
        assertEquals(a,new MyArray(1,1,2,2,3,3,4,4,5));
    }
}