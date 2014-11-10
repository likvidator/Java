package ru.netcracker;



public class Main {

    public static void main(String[] args) {
        Calc a = new Calc();
        //System.out.println(a.start("3*123/123+2+4+1.5"));
        String s = new String("2+2+(1+2+3)+1");
        System.out.println(a.start(s));

//        System.out.println(s.substring(5,10));
//        s = s.substring(0,4)+"5"+s.substring(11,s.length());
//        System.out.println(s);

    }
}
