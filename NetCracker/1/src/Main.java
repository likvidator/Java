/**
 * Created by likvidator on 02.03.15.
 */
public class Main {
    public static void main(String[] arg) throws ClassNotFoundException, InstantiationException, IllegalArgumentException, IllegalAccessException{
        SomeBean sb = (new Injector().inject(new SomeBean(someField)));
        sb.doSome();
    }
}
