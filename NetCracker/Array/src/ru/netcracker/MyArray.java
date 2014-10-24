package ru.netcracker;



public class MyArray {
    private Integer[] a;

    MyArray(int... args){
        a = new Integer[args.length];
        for (int i = 0; i < args.length ; i++) {
            a[i]=args[i];
        }
    }
    MyArray(int value){
        a = new Integer[1];
        a[0]=value;
    }
    public void printArr(){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public void add (int element){
        Integer[] ar = new Integer[a.length+1];
        for (int i = 0; i <a.length ; i++) {
            ar[i]=a[i];
        }
        ar[a.length]=element;
        a=ar;
    }
    public Integer getByIndex(int index){
        if(index<=a.length-1) {
            return a[index];
        }
        else return null;
    }
    public int min(){
        int min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<min) min = a[i];
        }
        return min;
    }
    public int max(){
        int max = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max) max = a[i];
        }
        return max;
    }
    public Integer find(int element){
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==element) return i;
        }
        return null;
    }
    public void remove(int index){
        if(this.getByIndex(index)!=null) {
            a[index] = null;
            Integer[] ar= new Integer[a.length-1];
            for (int i = 0,j=0; i <a.length ; i++) {
                if (a[i] != null) {
                    ar[j] = a[i];
                    j++;
                }
            }
            a=ar;
        }

    }
}

