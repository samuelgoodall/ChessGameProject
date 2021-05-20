package GamePieces.tests;

import GamePieces.GamePiece;
import GamePieces.Peasant;
import javafx.util.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeasantTest extends GamePieceTest {

    @Before
    @Override
    public void setUp() throws Exception {
        gamePiece = new Peasant(4,4, GamePiece.colourEnum.black);
        super.setUp();
    }

    @Override
    public void getPossibleMoves() {

        testGetMovesInsidePeasantBoard(4,4, GamePiece.colourEnum.white);
        movearray.clear();
        testGetMovesInsidePeasantBoard(7,4,GamePiece.colourEnum.white);
        movearray.clear();
        testGetMovesInsidePeasantBoard(1,2,GamePiece.colourEnum.white);
        movearray.clear();


        testGetMovesInsidePeasantBoard(4,4,GamePiece.colourEnum.black);
        movearray.clear();
        testGetMovesInsidePeasantBoard(7,4,GamePiece.colourEnum.black);
        movearray.clear();
        testGetMovesInsidePeasantBoard(1,6,GamePiece.colourEnum.black);
        movearray.clear();
    }

    @Test
    public void testGetPossibleMoves() {
    }


    public void testGetMovesInsidePeasantBoard(int x, int y, GamePiece.colourEnum colour) {

        gamePiece = new Peasant(x,y,colour);

        int i = 1;
        if(gamePiece.getColour() == GamePiece.colourEnum.black){
            i=-1;
        }
        Pair<Integer,Integer> position=gamePiece.getPosition();

        int x2 = x+i;
        int x3 = x-i;
        int y1 = y+i;

        if(gamePiece.getInitialPosition()){
            movearray.add(new Pair<>(position.getKey(),position.getValue()+ 2*i ));
        }
        if(y1>0&&y1<7){
            movearray.add(new Pair<>(x, y1));
            if(0<x2&&7>x2){
                movearray.add(new Pair<>(x2,y1));
            }
            if(0<x3&&7>x3){
                movearray.add(new Pair<>(x3,y1));
            }
        }

        testGetMovesInsideBoard(x,y);
    }

    @Override
    public  void testGetMovesInsideBoard(int x , int y){

        for(Pair<Integer,Integer> pos:movearray){
            if(pos.getKey()>8||pos.getKey()<0||pos.getValue()>8||pos.getKey()<0){
                throw new AssertionError("Moves out of Game Board");
            }
        }

        assertEquals(movearray, new HashSet<>(gamePiece.getPossibleMoves()),
                "Moves not Correct"+"x,yCoords:"+x+"|"+y+"Colour:"+ gamePiece.getColour());

    }

}