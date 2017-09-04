package GarysGames;

import java.util.ArrayList;

/**
 * Created by Digital Anvil on 31.08.2017.
 */
public class Field {
    private ArrayList<Unit> units;

    public Field() {
        units = new ArrayList();
    }


    public void addUnit(Unit unit){
        units.add(unit);
    }

    public Unit getUnit(int unitNumber) {
        return units.get(unitNumber);
    }

    public void removeUnit(Unit unit){
        units.remove(unit);
    }

    public void removeUnits(){
        units.clear();
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }
    public void addUnits(ArrayList<Unit> units){
        this.units.addAll(units);
    }
}
