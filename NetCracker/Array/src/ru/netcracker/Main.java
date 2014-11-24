package ru.netcracker;

public class Main {

    public static void main(String[] args) {
        Test a = new Test();
        MyArray myar= new MyArray();
        SortArray sortarr = new SortArray();
        a.start(myar);
        a.start(sortarr);
    }
}
