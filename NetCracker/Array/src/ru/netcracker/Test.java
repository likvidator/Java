package ru.netcracker;


import java.util.Random;

public class Test {
    public void start(Array list){
        Random rand = new Random();
        long st,and;
        st = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            list.add(rand.nextInt(100));
        }
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": add: " + (and-st));

        st = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.find(rand.nextInt(100));
        }
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": find: " + (and-st));

        st = System.currentTimeMillis();
        int min = list.min();
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": min: " + (and-st));

        st = System.currentTimeMillis();
        int max = list.max();
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": max: " + (and-st));

        st = System.currentTimeMillis();
        list.sort();
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": sort: " + (and-st));

        st = System.currentTimeMillis();
        for (int i = 0 ; i < list.len(); i++) {
            list.remove(0);
        }
        and = System.currentTimeMillis();
        System.out.println(list.getClass() + ": del: " + (and-st));

    }
}
