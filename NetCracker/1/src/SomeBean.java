
/**
 * Created by likvidator on 02.03.15.
 */
public class SomeBean {
    @AutoInjectable
    private SomeInterface someField;

    public SomeBean(SomeInterface someField) {
        this.someField = someField;
    }

    public void doSome(){
        someField.doSome();
    }
}
