package Units;

import java.util.ArrayList;

public abstract class Crossbowmen extends BaseUnit implements GameInterface {

    protected int arrow, crossbow, tip;

    public Crossbowmen(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int arrow, int crossbow, int tip) {
        super(initiative, team, damage, name, hp, maxhp, attack, defense, speed);
        this.arrow = arrow;
        this.crossbow = crossbow;
        this.tip = tip;
    }
    
    public void Hit() {
        System.out.println(name + " is hitting");
    }

}
