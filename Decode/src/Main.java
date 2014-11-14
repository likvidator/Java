import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String a = readfile("test.txt");
        MyArray n = new MyArray();
        n.add("12");
        n.add("a");


    }
    private  static String readfile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        String out="";
        while ((line = reader.readLine()) != null) {
            out+=line;
        }
        System.out.println(out);
        return out;

    }
}
