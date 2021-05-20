package GamePieces.tests;

import GamePieces.GamePiece;
import GamePieces.Rook;
import javafx.util.Pair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RookTest extends GamePieceTest{

    @Before
    public void setUp() throws Exception {
        gamePiece = new Rook(4,4, GamePiece.colourEnum.black);
        super.setUp();
    }

    @After
    public void tearDown() {
    }


    @Override
    public void testGetMovesInsideBoard(int x, int y) {


        for(int i=0; i<8;i++){
            if(i!=x){
                movearray.add(new Pair<>(i, y));
            }
            if(i!=y){
                movearray.add(new Pair<>(x, i));
            }
        }

        super.testGetMovesInsideBoard(x,y);
    }
}