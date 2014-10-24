package ru.fight.model;

public class Unit {
    public float live;
    public float power;
    public float speed;
    public float endurance;
    public String name;
    public Unit(String name, float live, float power, float speed ,float endurance){
        this.name=name;
        this.live=live;
        this.power=power;
        this.speed=speed;
        this.endurance=endurance;
    }
    public float isLive(){
        if (this.live<=0){
            return 0;
        };
        return this.live;
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

}