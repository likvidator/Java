
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
    public boolean Dead(){
        return this.half <= 0;
    }

    public static void main(String[] args){
        People test = new People();
        Elf el = new Elf();
        Fight round = new Fight(test,el);
        round.Start();
    }
}