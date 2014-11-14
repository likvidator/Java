/**
 * Created by likvidator on 14.11.14.
 */
public class MyArray {
    private String s[];
    private int n[];
    public MyArray(){
        s = new String[0];
        n = new int[0];
    }
    public void add(String a ){
        String s1[] = new String[s.length+1];
        int n1[] = new int[n.length+1];
        for (int i = 0; i <s.length ; i++) {
            s1[i]=s[i];
            n1[i]=n[i];
        }
        s1[s.length]=a;
        n1[n.length]=0;
        s=s1;
        n=n1;
    }
}
