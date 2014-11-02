package ru.netcracker;

//Размер побольше.

public class MyArray {
    private Integer[] a;

    public MyArray(int... args){
        a = new Integer[args.length];
        for (int i = 0; i < args.length ; i++) {
            a[i]=args[i];
        }
    }
    MyArray(int value){
        a = new Integer[1];
        a[0]=value;
    }
    public int len(){
        return a.length;
    }
    public void printArr(){
        if (a.length==0){
            System.out.println("no element");
            return;
        }
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
    public Integer min(){
        if (a.length==0){
            return null;
        }
        int min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<min) min = a[i];
        }
        return min;
    }
    public Integer max(){
        if (a.length==0){
            return null;
        }

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
    public void sort(){
        int p;
        for (int j = 0; j <a.length ; j++) {
            for (int i = 0; i <a.length - 1 ; i++)
                if (a[i] > a[i + 1]) {
                    p = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = p;
                }
        }
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (obj.getClass()!=this.getClass()){
            return false;
        }
        final MyArray other = (MyArray)obj;
        if (this.len()!=other.len()){
            return false;
        }
        for (int i = 0; i <this.len() ; i++) {
            if (this.getByIndex(i)!=other.getByIndex(i)){
                return false;
            }

        }
        return true;
    }
}

