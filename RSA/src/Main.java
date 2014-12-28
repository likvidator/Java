import java.math.BigInteger;

/**
 * Created by likvidator on 13.11.14.
 */
public class Main {
        public static void main(String[] args) {
                System.out.println("Test");
                long e = 517776452420107l;
                long n = 12377;
                long[] c = { 5, 0, 5, 2, 7, 9, 4, 5, 2, 3, 3, 4, 2, 9, 2, 3, 2, 1, 7, 4, 9, 0, 2, 4, 0, 6, 7, 4, 9, 4, 4, 2, 9, 2, 6, 7, 7, 0, 5, 1, 2, 9, 4, 1, 2, 9, 9, 7, 3, 7, 1, 8, 5, 0, 2, 2, 7, 2, 8};
                long[] m = decrypt_rsa(c,e,n);
                for (int i = 0; i < m.length; i++) {
                        System.out.println(m[i]);
                }
        }
        public static long eiler(long n){
                long result = n ;
                for (int i = 2; i < i*i ; i++) {
                        if (n % i ==0){
                                while (n % i ==0)
                                        n/=i;
                                result -= result/i;
                        }
                        if (n>1) {
                                result -= result / n;
                        }
                }
                return result;
        }
        public static long[] decrypt_rsa(long[] c, long e,long n){
                long phi = eiler(n);
                long d = 1;
                while (e *d % phi != 1) d++;

                long[] m = new long[c.length];
                for (int i = 0; i < c.length; i++) {
                        m[i]= mypow(c[i],d)%n;
                }
                return m;
        }
        public static long mypow(long a ,long x){
                long result = a;
                if (a!=0) {
                        for (int i = 2; i <=x;i++){
                                result = result * a;
                        }
                }
                return result;
        }
        public static long NOD(long x, long y){
                long a = x;
                long b = y;
                while (a!=b){
                        if (a>b) a-=b;
                        else
                                if (b>a) b-=a;
                }
                return a;
        }
}
/*
//            long phi = eiler(n);
//            Console.WriteLine("phi=" + phi);
//            Console.WriteLine("phi(phi)="+eiler(phi));
//            long d = e;
//            while (!((e * d % phi == 1))) d--;
//            Console.WriteLine(d);
//            Console.WriteLine(e * d % phi);
//            long m = mypow(5, d) % phi;
//            Console.WriteLine(m);
//            Console.WriteLine(mypow(m, e) % phi);

decimal[] m = decrypt_rsa(c, e, n);
for (int i = 0; i < m.Length; i++)
        Console.WriteLine(m[i]);
        Console.WriteLine();
//            for (int i = 0; i < c.Length; i++)
//                Console.WriteLine(mypow(m[i],e) % n);


        Console.ReadKey();
        }

public static decimal eiler(decimal n)
        {
        decimal result = n;
        for (int i = 2; i * i <= n; ++i)
        if (n % i == 0)
        {
        while (n % i == 0)
        n /= i;
        result -= result / i;
        }
        if (n > 1)
        result -= result / n;
        return result;
        }

public static decimal[] decrypt_rsa(decimal[] c, decimal e, decimal n)
        {
        decimal phi = eiler(n);

        //long d =  mypow(e,(eiler(phi)-1));

        decimal d = 1;
        while (e * d % phi != 1) d++;


        decimal[] m = new decimal[c.Length];
        for (int i = 0; i < c.Length; i++)
        m[i] = mypow(c[i],d) % n;

        return m;
        }

public static decimal mypow(decimal a, decimal x)
        {
        decimal result = a;
        if (a != 0)
        for (int i = 2; i <= x; i++)
        result = result * a;
        return result;
        }

public static long NOD(long x, long y)
        {
        long a = x, b = y;
        while (a != b)
        if (a > b) a -= b;
        else
        if (b > a) b -= a;
        return a;
        }
        }
        }

 */