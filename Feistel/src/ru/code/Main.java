package ru.code;

//http://habrahabr.ru/post/187606/
//http://habrahabr.ru/post/140404/

import java.io.*;
import java.util.ArrayList;


public class Main {
    private static int rounds = 10;

    public static void main(String[] args) throws IOException {
        int a[];
        a=fileread("test");                     //Считываем файл, который надо зашифровать
        feist(a,keygen(3));                     //Отправляем на шифрование
        filewrite("shifr",a);                   //Записываем зашифрованный файл
        int b[] = fileread("shifr");            //Считываем шифр
        refeist(b,keygen(3));                   //Расшифровываем
        filewrite("output",b);                  //Записываем результат
    }
    public static int[] fileread(String filename) throws IOException {
        DataInputStream myfile = new DataInputStream(new FileInputStream(filename));
        ArrayList<Integer> list = new ArrayList<Integer>();

        int p;
        p=myfile.read();
        while (p!=-1) {
            list.add(p);
            p=myfile.read();
        }
        if (list.size()%2!=0)
            list.add(0);
        int a[]=new int[list.size()];
        for (int j = 0; j <list.size() ; j++) {
            a[j]=list.get(j);
        }
        myfile.close();
        return a ;
    }

    public static void filewrite(String filename,int[] a) throws IOException {
        FileOutputStream file  = new FileOutputStream(filename);
        DataOutputStream myfile = new DataOutputStream(file);

        for (int i = 0; i <a.length ; i++) {
            myfile.write(a[i]);
        }
        myfile.close();
    }

    public static int[] keygen( int k){                     //Генератор ключей
        int n = rounds;
        int a[] = new int[n];
        int t=1;
        for (int i = 0; i < n; i++) {
           // a[i] = ((k >>> (t * 6)) ^ ((k) << (t * 7)));
            a[i] = right(k,6)^left(k,7);
            t++;
        }
        return a;

    }

    public static void feist(int[] a, int[] key) {
        if (a.length % 2 == 0) {                            //Проверяем четное ли количество блоков
            for (int p = 0; p < a.length - 1; p += 2) {     //Разбиваем на левый и правый блок
                int l = a[p];
                int r = a[p + 1];
                for (int i = 0; i < rounds; i++) {          //Начало шифрования
                    if (i < rounds - 1)
                    {
                        int x = key[i] ^ r;
                        l = l ^ f(x);
                        int z = l;
                        l = r;
                        r = z;
                    } else {                                //Последний раунд без обмена
                        int x = key[i] ^ r;
                        l = l ^ f(x);
                    }
                }
                a[p] = l;
                a[p + 1] = r;
            }
        }
        else
            System.out.println("Error of length");
    }
    public static void refeist(int[] a, int[] key)
    {
        if(a.length%2==0) {
            for (int p = 0; p < a.length - 1; p += 2) {
                int l = a[p];
                int r = a[p + 1];
                int k = key.length - 1;                     //Обратный порядок ключей
                for (int i = 0; i < rounds; i++) {
                    if (i < rounds - 1)
                    {
                        int x = key[k] ^ r;
                        l = l ^ f(x);
                        int z = l;
                        l = r;
                        r = z;
                    } else {
                        int x = key[k] ^ r;
                        l = l ^ f(x);
                    }
                    k -= 1;
                }
                a[p] = l;
                a[p + 1] = r;
            }
        }
        else System.out.println("Error of length");
    }
    public static int left(int a , int i ){

        return (a<<i)|(a>>32-i);
    }
    public static int right(int a, int i ){
        return (a>>i)|(a<<32-i);
    }
    private static int f(int a)
    {
//        return ((a << 17) ^ (((a & 0xAAAAAAA) >> 4) | (~a & 0x5555555)));
        return ((a << 17) ^ (((a & 0x0F0F0F0F) >> 4) | (~a & 0xF0F0F0F0)));//0x0F0F0F0F - четные, 0xF0F0F0F0 - нечетные
    }
}
