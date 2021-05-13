package GamePieces;

import javafx.util.Pair;

import java.util.ArrayList;

public abstract class GamePiece {
    protected Pair<Integer,Integer> position;
    protected String colour;
    protected Boolean wasMoved;

    public GamePiece(int posX, int posY,String colour){
        position = new Pair<>(posX,posY);
        this.colour=colour;
        this.wasMoved=false;
    }

    public abstract ArrayList<Pair<Integer, Integer>> getPossibleMoves();

    public void setPosition(Pair<Integer,Integer> position){
        wasMoved = true;
        this.position = position;
    }


}