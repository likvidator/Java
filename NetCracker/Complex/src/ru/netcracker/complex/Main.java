package ru.netcracker.complex;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(3,3);
        Complex b = new Complex(2,2);
        a.mult(b);
        System.out.println(a.print(a));

    }
}
