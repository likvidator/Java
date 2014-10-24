package ru.netcracker;

public class Test {

    public  Integer arrmin(int[] a){
        if ((a==null)||(a.length==0))
            return null;
        int min = a[0];

        for (int i = 0; i <a.length ; i++) {
            if (a[i]<min)
                min=a[i];
        }

        return min;
    }

    public  void sort(int[] a){
        int p;
        for (int j = 0; j <a.length ; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    p = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = p;
                }
            }
        }
    }
}
