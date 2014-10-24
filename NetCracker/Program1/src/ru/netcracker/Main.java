package ru.netcracker;

import java.util.Random;


/*
1.Написать свою обертку на массив.
Класс MyArray
private  int[] body;
public void add (int element) (Добавляет элемент на первую свободную позицию)
public int getByIndex(element)
public int min(element)
public int max(element)
public void sort()
public void print()
public int find()(Индекс элемента если существует)
public void remove()(по индексу)


2.Нужно написать свой парсер выражения
Класс, содержит метод Calc. И он эту строчку вычесляет. Передается Sring.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=rand.nextInt(100);
        }
        for (int x:arr){
            System.out.print(x+" ");
        }

        ru.netcracker.Test a= new Test();

        System.out.println("min = " + a.arrmin(arr));
        a.sort(arr);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }


}
