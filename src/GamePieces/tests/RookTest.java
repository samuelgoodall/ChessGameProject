package GamePieces.tests;

import GamePieces.GamePiece;
import GamePieces.Rook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RookTest extends GamePieceTest{

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPossibleMoves() {

    }

    @Override
    public void testGetMovesInsideBoard() {
        GamePiece gamePiece = new Rook(4,4, GamePiece.colourEnum.black);

        gamePiece.getPossibleMoves();

    }
}