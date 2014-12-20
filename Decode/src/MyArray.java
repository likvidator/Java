/**
 * Created by likvidator on 14.11.14.
 */
public class MyArray {
    private char s[];
    private double n[];
    public MyArray(){
        s = new char[0];
        n = new double[0];
    }
    public int len(){
        return s.length;
    }
    public char getbuindex(int i){
        return s[i];
    }
    public int search(char e){
        for (int i = 0; i < s.length; i++) {
            if (s[i]==e)
                return i;
        }
        return -1;
    }
    public void add(char a ){
        char s1[] = new char[s.length+1];
        double n1[] = new double[n.length+1];
        for (int i = 0; i <s.length ; i++) {
            s1[i]=s[i];
            n1[i]=n[i];
        }
        s1[s.length]=a;
        n1[n.length]=1;
        s=s1;
        n=n1;
    }
    public void addto(char a, double d){
        char s1[] = new char[s.length+1];
        double n1[] = new double[n.length+1];
        for (int i = 0; i <s.length ; i++) {
            s1[i]=s[i];
            n1[i]=n[i];
        }
        s1[s.length]=a;
        n1[n.length]=d;
        s=s1;
        n=n1;
    }
    public boolean chack(char e ){
        for (int i = 0; i <s.length ; i++) {
            if (s[i]==e){
                return true;
            }
        }
        return false;
    }
    public void print (){
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i] + " " + n[i]);
        }
    }

    public void inc(char e) {
        for (int i = 0; i <s.length ; i++) {
            if (s[i]==e){
                n[i]++;
            }
        }

    }
    public void ver(){
        int sum = 0 ;
        for (int i = 0; i < n.length; i++) {
            sum+=n[i];
        }
        for (int i = 0; i < s.length; i++) {
            n[i]=n[i]/sum;
        }
    }
    public double testSum(){
        double summ = 0;
        for (int i = 0; i < n.length; i++) {
            summ+=n[i];
        }
        return summ;
    }
    public void sort(){
        double n1;
        char s1;
        for (int j = 0; j < n.length; j++) {
            for (int i = 0; i < n.length-1; i++) {
                if (n[i]<n[i+1]){
                    n1=n[i];
                    n[i]=n[i+1];
                    n[i+1]=n1;
                    s1=s[i];
                    s[i]=s[i+1];
                    s[i+1]=s1;
                }
            }
        }
    }
}
