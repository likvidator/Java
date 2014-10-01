
public class Unit {
    public float half;
    public float power;
    public float speed;
    public float set;
    public Unit(float h, float p, float s ,float se){
        half=h;
        power=p;
        speed=s;
        set=se;
    }

    public static void main(String[] args){
        People test = new People();
        System.out.println(test.speed);
    }
}