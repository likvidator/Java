package ru.netcracker;



public class Main {

    public static void main(String[] args) {
        Calc a = new Calc();
        String s = new String("(2+2)*(2+2)");
        System.out.println(a.start(s));
    }
}
