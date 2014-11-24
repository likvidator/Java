package ru.netcracker;



public class SortArray extends MyArray {

    SortArray(int value){
        super(value);
    }
    public SortArray(){
        super();
    }
     @Override
    public void add(int element){
         Integer[] ar = new Integer[super.len()+1];
         boolean st=false;
         for (int i = 0,j = 0; i < ar.length; i++) {
             if (j < super.len() && (!st)) {
                 if ((!st) && (element < super.getByIndex(j))) {
                     ar[i] = element;
                     st = true;
                 }
                 else {
                     ar[i] = super.getByIndex(j);
                     j++;
                 }
             }
             else
                 if ((i==ar.length-1)&&(!st)){
                     ar[i]=element;
                 }
                else{
                     ar[i] = super.getByIndex(j);
                     j++;
                 }
         }

         while (super.len()!=0){
             super.remove(0);
         }


         for (int i = 0; i <ar.length ; i++) {
             super.add(ar[i]);
         }
     }
    public Integer min(){
        return super.getByIndex(0);
    }
    public Integer max(){
        return super.getByIndex(super.len()-1);
    }
    public void sort(){};
}
