package ru.netcracker;


/**
 * Created by likvidator on 08.11.14.
 */
public class Calc {
    int p,l;

    public String  start(String a) {
        if ((a.contains("("))&&(a.contains(")"))){
            if (parenthesis(a)){
                int i1 = a.lastIndexOf("(")+1;
                int i2 = a.indexOf(")");
                String z = schet(a.substring(i1,i2));
                a=a.substring(0,i1-1)+z+a.substring(i2+1,a.length());
                start(a);
            }
            else {
                a="Не правильно расставлены скобки";
                return a;
            }
        }
        else {
            schet(a);
            return a;
        }

        return a;
    }
    private boolean parenthesis(String a){
        int i=0; ;
        char z [] = a.toCharArray();
        for (int j = 0; j <z.length ; j++) {
            if (z[j]=='('){
                i++;
            }
            if (z[j]==')'){
                i--;
            }
        }
        return i==0;
    }
    private String schet(String a ){
        while (a.contains("*")){
            a = multi(a);
        }
        while (a.contains("/")){
            a = divided(a);
        }
        while (a.contains("+")){
            a = plus(a);
        }
        while (a.contains("-")){
            a = minus(a);
        }
        return a;
    }


    private String plus( String a){
        p=0;
        l=0;
        int i  = a.indexOf("+");
        if (i==-1){
            return a;
        }
        double[] n= new double[2];
        left(n,a,i,0);
        right(n,a,i+1,i+2);
        if (l>0) l++;
        a=a.substring(0,l)+(n[0]+n[1])+a.substring(p,a.length());
        return a;
    }
    private String divided( String a){
        p=0;
        l=0;
        int i  = a.indexOf("/");
        if (i==-1){
            return a;
        }
        double[] n= new double[2];
        left(n,a,i,0);
        right(n,a,i+1,i+2);
        if (n[1]==0){
            a="Деление на 0";
            return a;
        }
        if (l>0) l++;
        a=a.substring(0,l)+(n[0]/n[1])+a.substring(p,a.length());
        return a;
    }
    private String multi( String a){
        p=0;
        l=0;
        int i  = a.indexOf("*");
        if (i==-1){
            return a;
        }
        double[] n= new double[2];
        left(n,a,i,0);
        right(n,a,i+1,i+2);
        if (l>0) l++;
        a=a.substring(0,l)+(n[0]*n[1])+a.substring(p,a.length());
        return a;
    }
    private String minus( String a){
        p=0;
        l=0;
        int i  = a.indexOf("-");
        if (i==-1){
            return a;
        }
        double[] n= new double[2];
        left(n,a,i,0);
        right(n,a,i+1,i+2);
        if (l>0) l++;
        a=a.substring(0,l)+(n[0]-n[1])+a.substring(p,a.length());
        return a;
    }


    private double[] left(double[] n, String a, int i,int count){
        try {
            n[0] = new Double(a.substring(count, i));
        } catch (NumberFormatException e) {
            count++;
            left(n, a, i, count);
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
