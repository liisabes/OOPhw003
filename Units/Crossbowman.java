package Units;
import java.util.ArrayList;
import java.util.Arrays;

public class Crossbowman extends Crossbowmen {

    public Crossbowman(ArrayList<BaseUnit> team, String name) {
        super(1, team, new int[] {1, 3}, name, 1, 10, 10, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nАрбалетчик";
    }

    @Override
    public void step() {
        

    }

    @Override
    public String getInfo() {
        return 
        "Имя: " + name + 
        "; Damage: " + Arrays.toString(damage) +
        "; Здоровье: " + hp + 
        "; Максимальное здоровье: " + maxhp + 
        "; Кол-во атак: " + attack + 
        "; Кол-во защит: " + defense + 
        "; Скорость: " + speed +  
        "; Кол-во стрел: " + arrow + 
        "; Кол-во арбалетов: " + crossbow +
        "; Кол-во наконечников " + tip +
        "; Initiative: " + initiative;
        

    }
}
