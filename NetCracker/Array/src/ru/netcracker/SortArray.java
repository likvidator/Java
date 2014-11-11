package ru.netcracker;



public class SortArray extends MyArray {

    SortArray(int value){
        super(value);
    }
    SortArray(){
        super();
    }
     @Override
    public void add(int element){
         Integer[] ar = new Integer[super.len()+1];
         boolean st=false;
         for (int i = 0,j=0; i <ar.length ; i++) {
             if(((element<super.getByIndex(j))&&(!st))||(j==super.len())) {
                 ar[i]=element;
                 st=true;
             }
             else {
                 ar[i] = super.getByIndex(j);
                 j++;
             }
         }
         for (int i = 0; i <super.len() ; i++) {
                super.remove(0);
         }
         for (int i = 0; i <ar.length ; i++) {
             super.add(ar[i]);
         }
     }
}
