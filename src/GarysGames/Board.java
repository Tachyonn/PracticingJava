package GarysGames;

import java.util.ArrayList;

/**
 * Created by Digital Anvil on 29.08.2017.
 */
public class Board {
    private Field board[][];

    public Board(int x, int y) {        //Добавьте конструктор Board, получающий высоту и ширину и создающий
        //доску с заданными параметрами. Конструктор должен разбивать доску на
        // клетки, характеризующиеся парой координат X-Y.
        board = new Field[x][y];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; i < board[i].length; j++) {
                board[i][j] = new Field();
            }
        }
    }

    public Field getField(int x, int y) { //возвращаем поле с координатами x,y
        return board[x - 1][y - 1];
    }

    public void addUnit(Unit unit, int x, int y) {
        Field field = getField(x, y);
        field.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y) {
        Field field = getField(x, y);
        field.removeUnit(unit);
    }

    public void removeUnits(int x, int y){
        Field field = getField(x,y);
        field.removeUnits();
    }

    public void addUnits(ArrayList<Unit> units, int x, int y) { //Напишите методы, добавляющие юниты на клетку с координатами X-Y.
        board[x - 1][y - 1].addUnits(units);
    }

    public ArrayList<Unit> getUnits(int x, int y) {  //Напишите метод, возвращающий все юниты с указанного поля X-Y.
        return board[x - 1][y - 1].getUnits();
    }

}
