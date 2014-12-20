import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static char t[]={'1','2','3','4','5','6','7','8','9','0','.','/',';','"','(',')',',',' ','-',':','—'};
    public static void main(String[] args) throws IOException {

        String a = readfile("test.txt");
        char s[] =a.toCharArray();
        MyArray n = new MyArray();
        for (int i = 0; i < s.length ; i++) {
            if (!symbol(s[i])) {
                if (!n.chack(s[i])) {
                    n.add(s[i]);
                } else {
                    n.inc(s[i]);
                }
            }
        }
        n.ver();
        n.sort();


        MyArray x = new MyArray();
        x.addto('e',0.127);
        x.addto('t',0.0906);
        x.addto('a',0.0817);
        x.addto('o',0.0751);
        x.addto('i',0.0697);
        x.addto('n',0.0675);
        x.addto('s',0.0633);
        x.addto('h',0.0609);
        x.addto('r',0.0599);
        x.addto('d',0.0425);
        x.addto('l',0.0403);
        x.addto('c',0.0278);
        x.addto('u',0.0276);
        x.addto('m',0.0241);
        x.addto('w',0.0236);
        x.addto('f',0.0223);
        x.addto('g',0.0202);
        x.addto('y',0.0197);
        x.addto('p',0.0193);
        x.addto('b',0.0149);
        x.addto('v',0.0098);
        x.addto('k',0.0077);
        x.addto('x',0.0015);
        x.addto('j',0.0015);
        x.addto('z',0.0007);
        x.addto('q',0.0001);

        MyArray rus = new MyArray();
        rus.addto('о',0.0940);
        rus.addto('а',0.0896);
        rus.addto('и',0.0739);
        rus.addto('е',0.0856);
        rus.addto('н',0.0662);
        rus.addto('р',0.0561);
        rus.addto('в',0.0400);
        rus.addto('т',0.0611);
        rus.addto('л',0.0358);
        rus.addto('к',0.0322);
        rus.addto('с',0.0554);
        rus.addto('ы',0.0225);
        rus.addto('м',0.0417);
        rus.addto('д',0.0280);
        rus.addto('п',0.0421);
        rus.addto('б',0.0243);
        rus.addto('з',0.0193);
        rus.addto('я',0.0197);
        rus.addto('у',0.0179);
        rus.addto('ч',0.0118);
        rus.addto('й',0.0125);
        rus.addto('г',0.0153);
        rus.addto('ь',0.0002);
        rus.addto('ж',0.0064);
        rus.addto('ю',0.0087);
        rus.addto('ш',0.0032);
        rus.addto('ц',0.0063);
        rus.addto('щ',0.0048);
        rus.addto('ф',0.0034);
        rus.addto('э',0.0033);
        rus.addto('х',0.0093);
        rus.addto('ь',0.0094);

        char nev[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            if(!symbol(s[i])){
                nev[i]=rus.getbuindex(n.search(s[i]));
                //System.out.println(nev[i]);
            }
            else {
                nev[i] = s[i];
            }
        }
        for (int i = 0; i < nev.length; i++) {
            System.out.print(nev[i]);
        }

    }
    private static boolean symbol(char a ){
        for (int i = 0; i < t.length; i++) {
            if (t[i]==a){
                return true;
            }

        }
        return false;
    }
    private  static String readfile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        String out="";
        while ((line = reader.readLine()) != null) {
            out+=line;
        }
        //System.out.println(out);
        return out;

    }
}
