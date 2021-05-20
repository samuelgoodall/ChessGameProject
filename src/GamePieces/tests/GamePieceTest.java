package GamePieces.tests;

import GamePieces.GamePiece;
import javafx.util.Pair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class GamePieceTest {
    protected GamePiece gamePiece;

    protected Set<Pair<Integer,Integer>> movearray;
    @Before
    public void setUp() throws Exception {
       movearray = new HashSet<>();
    }

    @After
    public void tearDown() {
        movearray.clear();
    }

    @Test
    public void getPossibleMoves() {

        gamePiece.setColour(GamePiece.colourEnum.white);
        testGetMovesInsideBoard(4,4);
        movearray.clear();
        testGetMovesInsideBoard(7,4);
        movearray.clear();
        testGetMovesInsideBoard(1,2);
        movearray.clear();

        gamePiece.setColour(GamePiece.colourEnum.black);
        testGetMovesInsideBoard(4,4);
        movearray.clear();
        testGetMovesInsideBoard(7,4);
        movearray.clear();
        testGetMovesInsideBoard(1,6);
        movearray.clear();
    }


    public  void testGetMovesInsideBoard(int x , int y){
        gamePiece.setPosition(new Pair<>(x, y));

        for(Pair<Integer,Integer> pos:movearray){
            if(pos.getKey()>8||pos.getKey()<0||pos.getValue()>8||pos.getKey()<0){
                throw new AssertionError("Moves out of Game Board");
            }
        }

        assertEquals(movearray, new HashSet<>(gamePiece.getPossibleMoves()),
                "Moves not Correct"+"x,yCoords:"+x+"|"+y+"Colour:"+ gamePiece.getColour());

    }


}