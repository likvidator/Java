
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
    public boolean isDead(){
        return this.half <= 0;
    }
    public void blow_head(Unit a){
        a.half-=this.power*0.1+this.speed*0.2;
    }
    public void blow_body(Unit a){
        a.half-=this.power*0.1+this.speed*0.2;

    }
    public void blow_hands(Unit a){
        a.half-=this.power*0.1+this.speed*0.2;

    }
    public void blow_feet(Unit a){
        a.half-=0;

    }

    public static void main(String[] args){
        Start a = new Start();

        a.startGame();
        Unit One = a.setA();
        Unit Two = a.setB();
        Fight round = new Fight(One,Two);
        round.Start();

    }
}