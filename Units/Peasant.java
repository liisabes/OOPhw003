package Units;
import java.util.ArrayList;
import java.util.Arrays;

public class Peasant extends Peasants {

    public Peasant(ArrayList<BaseUnit> team, String name) {
        super(2, team, new int[] {1, 3}, name, 10, 10, 10, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nКрестьянин";
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
        "; Кол-во урожая: " + crop +
        "; Кол-во домов: " + house +
        "; Кол-во животных: " + animal +
        "; Initiative: " + initiative;

    }

}
