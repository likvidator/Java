
public class Unit {
    public float live;
    public float power;
    public float speed;
    public float endurance;
    public Unit(float live, float power, float speed ,float endurance){
        this.live=live;
        this.power=power;
        this.speed=speed;
        this.endurance=endurance;
    }
    public boolean isDead(){
        return this.live <= 0;
    }
    public void hit_head(Unit a){
        a.live-=this.power*0.1+this.speed*0.2;
    }
    public void hit_body(Unit a){
        a.live-=this.power*0.1+this.speed*0.2;

    }
    public void hit_hands(Unit a){
        a.live-=this.power*0.1+this.speed*0.2;

    }
    public void hit_feet(Unit a){
        a.live-=0;

    }

    public static void main(String[] args){
//        Form app = new Form(); //Создаем экземпляр нашего приложения
//        app.setVisible(true);
        Start a = new Start();

        a.startGame();
        Unit One = a.getA();
        Unit Two = a.getB();
        Fight round = new Fight(One,Two);
        round.Start();

    }
}