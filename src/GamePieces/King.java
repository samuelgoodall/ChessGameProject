package GamePieces;

import javafx.util.Pair;

import java.util.ArrayList;

public class King extends GamePiece{

    public King(int posX, int posY, String colour) {
        super(posX, posY, colour);
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getPossibleMoves() {
        ArrayList<Pair<Integer, Integer>> movearray = new ArrayList<>();
        int[] valuearray = {0,1,-1};

        for(int i=0; i<3; i++){
            for(int c=0; c<3; c++){
                int new_x = position.getKey()+valuearray[i];
                int new_y = position.getValue() + valuearray[c];
                if((new_x>=0)&&(new_x<8)&&(new_y>=0)&&(new_y<8)){
                    movearray.add(new Pair<>(position.getKey()+valuearray[i], position.getValue()+valuearray[c]));
                }
            }
        }
        movearray.remove(0);
        System.out.println(movearray);
        return movearray;
    }
}
