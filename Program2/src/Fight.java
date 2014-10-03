
public class Fight {
    public Unit a;
    public Unit b;

    public Fight(Unit a, Unit b){
        this.a=a;
        this.b=b;
    }
    public void blow_head(Unit a,Unit b){
        b.half-=a.power*0.1+a.speed*0.2;
    }
    public void blow_body(Unit a,Unit b){
        b.half-=a.power*0.1+a.speed*0.2;

    }
    public void blow_hands(Unit a,Unit b){
        b.half-=a.power*0.1+a.speed*0.2;

    }
    public void blow_feet(Unit a,Unit b){
        b.half-=a.power*0.1+a.speed*0.2;

    }
    public void Start(){

        while (!this.a.Dead()|!this.b.Dead()){
            
        }

    }


}
