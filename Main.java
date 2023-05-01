import java.util.ArrayList;
import Units.BaseUnit;
import Units.Crossbowman;
import Units.Magician;
import Units.Monk;
import Units.Names;
import Units.Outlaw;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        int randomValue = 8;
        int countOfHerous = 10;
        ArrayList<BaseUnit> lArrayList1 = new ArrayList<>();
        for (int i = 0; i < countOfHerous; i++) {
            switch (new Random().nextInt(randomValue)) {
                case 0:
                    lArrayList1.add(new Crossbowman(lArrayList1, getName()));
                    break;
                case 1:
                    lArrayList1.add(new Magician(lArrayList1, getName()));
                    break;
                case 2:
                    lArrayList1.add(new Monk(lArrayList1, getName()));
                    break;
                case 4:
                    lArrayList1.add(new Peasant(lArrayList1, getName()));
                    break;
                case 5:
                    lArrayList1.add(new Sniper(lArrayList1, getName()));
                    break;
                case 6:
                    lArrayList1.add(new Spearman(lArrayList1, getName()));
                    break;
                case 7:
                    lArrayList1.add(new Outlaw(lArrayList1, getName()));
                    break;
            }
        }

        ArrayList<BaseUnit> lArrayList2 = new ArrayList<>();
        for (int i = 0; i < countOfHerous; i++) {
            switch (new Random().nextInt(randomValue)) {
                case 0:
                    lArrayList2.add(new Crossbowman(lArrayList2, getName()));
                    break;
                case 1:
                    lArrayList2.add(new Magician(lArrayList2, getName()));
                    break;
                case 2:
                    lArrayList2.add(new Monk(lArrayList2, getName()));
                    break;
                case 4:
                    lArrayList2.add(new Peasant(lArrayList2, getName()));
                    break;
                case 5:
                    lArrayList2.add(new Sniper(lArrayList2, getName()));
                    break;
                case 6:
                    lArrayList2.add(new Spearman(lArrayList2, getName()));
                    break;
                case 7:
                    lArrayList1.add(new Outlaw(lArrayList2, getName()));
                    break;
            }
        }

        System.out.println("\nКоманда 1:\n");
        lArrayList1.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\nКоманда 2:\n");
        lArrayList2.forEach(n -> System.out.println(n.getInfo()));
        lArrayList2.forEach(n->n.step());
        System.out.println("\nКоманда 2:\n");
        lArrayList2.forEach(n -> System.out.println(n.getInfo()));
        lArrayList2.sort(BaseUnit::compareTo);
        System.out.println("\nКоманда 2:\n");
        // System.out.println(lArrayList2);
        lArrayList2.forEach(n -> System.out.println(n.getInfo()));


        
    }
    
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
