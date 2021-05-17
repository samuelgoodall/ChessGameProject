package GamePieces;





import javafx.util.Pair;

import java.util.ArrayList;

public class Rook extends GamePiece{

    public Rook(int posX, int posY, GamePiece.colourEnum colour) {
        super(posX, posY, colour);
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getPossibleMoves() {

        ArrayList<Pair<Integer, Integer>> movearray = new ArrayList<>();

        int x = position.getKey();
        int y = position.getValue();

        for(int i=0; i<8;i++){
            if(i!=position.getKey()){
                movearray.add(new Pair<>(i, y));
            }
            if(i!=position.getValue()){
                movearray.add(new Pair<>(x, i));
            }
        }

        movearray.remove(0);
        System.out.println(movearray);
        return movearray;
    }
}
