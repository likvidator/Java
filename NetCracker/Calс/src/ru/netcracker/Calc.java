package ru.netcracker;


/**
 * Created by likvidator on 08.11.14.
 */
public class Calc {
    public String  start(String a) {
        int i  = a.indexOf("*");
        double[] z= new double[2];
        pars(z,a,i,0);

        System.out.println(z[0] + " " + z[1]);
        return a;
    }
    private double[] pars(double[] n, String a, int i,int count){
        left(n,a,i,count);
        right(n,a,i+1,i+2);
        return n;
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
        return n;
    }
    private double[] right(double[] n, String a, int i , int count){
        try {
            n[1] = new Double(a.substring(i,count));
            right(n,a,i,count+1);
        }
        catch (StringIndexOutOfBoundsException e ){
            return n;
        }

        return n;
    }
}
