package ru.netcracker;


/**
 * Created by likvidator on 08.11.14.
 */
public class Calc {
    int p,l;

    public String  start(String a) {
        System.out.println(plas(plas(a)));
        return a;

    }
    private String plas( String a){
        p=0;
        l=0;
        int i  = a.indexOf("+");
        double[] n= new double[2];
        left(n,a,i,0);
        right(n,a,i+1,i+2);
        a=a.substring(0,l)+(n[0]+n[1])+a.substring(p,a.length());
        return a;
    }
    private double[] left(double[] n, String a, int i,int count){
        boolean status = true;
        while(status) {
            try {
                n[0] = new Double(a.substring(count, i));
                status=false;


            } catch (NumberFormatException e) {
                count++;
                left(n, a, i, count);
            }
        }
        l = count;
        return n;
    }
    private double[] right(double[] n, String a, int i , int count){
        try {
            n[1] = new Double(a.substring(i,count));
            right(n,a,i,count+1);
        }
        catch (StringIndexOutOfBoundsException e  ){
            p = count-1;
            return n;
        }
        catch (NumberFormatException e){
            p = count-1;
            return n;
        }

        return n;
    }
}
