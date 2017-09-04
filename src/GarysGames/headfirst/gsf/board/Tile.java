package GarysGames.headfirst.gsf.board;

import GarysGames.headfirst.gsf.unit.Unit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Digital Anvil on 31.08.2017.
 */
public class Tile {
    private List units;

    public Tile() {
        units = new LinkedList();
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits() {
        units.clear();
    }

    protected List getUnits() {
        return units;
    }
}
