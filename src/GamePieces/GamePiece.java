package GamePieces;

import javafx.util.Pair;

import java.util.ArrayList;

public abstract class GamePiece {
    protected Pair<Integer,Integer> position;
    protected colourEnum colour;

    protected Boolean initialPosition;

    public GamePiece(int posX, int posY,colourEnum colour){
        position = new Pair<>(posX,posY);

        this.colour= colour;
        this.initialPosition = true;

    }

    public abstract ArrayList<Pair<Integer, Integer>> getPossibleMoves();

    public void setPosition(Pair<Integer,Integer> position){

        initialPosition = true;
        this.position = position;
    }

    public enum colourEnum {
        black,
        white
    }

    public colourEnum getColour(){
        return colour;
    }

    public void setColour(colourEnum colour){
        this.colour=colour;
    }

    public Boolean getInitialPosition(){
        return initialPosition;
    }

    public Pair<Integer,Integer> getPosition(){
        return position;
    }

}
