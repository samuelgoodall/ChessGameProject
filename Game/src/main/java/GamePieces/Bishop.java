package GamePieces;

import com.github.javaparser.utils.Pair;

import java.util.ArrayList;

public class Bishop extends GamePiece{
    public Bishop(int posX, int posY, String colour) {
        super(posX, posY, colour);
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getPossibleMoves() {
        ArrayList<Pair<Integer, Integer>> movearray = new ArrayList<>();


        for(int c = 0; c < 8; c++){
            int new_x = position.a + c;
            int new_y = position.b + c;
            if((new_x>=0)&&(new_x<8)&&(new_y>=0)&&(new_y<8)) {
                movearray.add(new Pair<>(new_x, new_y));
            }
            System.out.println(new_y);
        }

        System.out.println(movearray);

        return movearray;
    }
}
