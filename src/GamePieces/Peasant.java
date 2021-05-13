package GamePieces;



import javafx.util.Pair;

import java.util.ArrayList;

public class Peasant extends GamePiece{

    public Peasant(int posX, int posY,String colour) {
        super(posX, posY,colour);
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getPossibleMoves() {

        ArrayList<Pair<Integer, Integer>> movearray = new ArrayList<>();
        int sign = 1;
        int moved=0;
        if(colour.equals("black")){
            sign = -1;
        }
        if(!wasMoved){
           moved = 1;
        }
        int x=this.position.getKey();
        int y=this.position.getValue();

        //move peasant normally
        movearray.add(new Pair<>(x, y + (sign * (moved +1))));
        movearray.add(new Pair<>(x+ sign,y+ sign));

        return movearray;
    }


}
