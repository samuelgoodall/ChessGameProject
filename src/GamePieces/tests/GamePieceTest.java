package GamePieces.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public abstract class GamePieceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPossibleMoves() {
    }
    @Test
    @DisplayName("get all possible moves inside Board")
    public abstract void testGetMovesInsideBoard();
}